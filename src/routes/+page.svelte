
<script lang="ts">
  import "../app.pcss";
  import { writable } from "svelte/store";
  import { Separator } from "$lib/components/ui/separator";
  import * as Select from "$lib/components/ui/select";
  import * as Accordion from "$lib/components/ui/accordion";
  import { onMount } from "svelte";
  import { Button } from "$lib/components/ui/button";
  import { buttonVariants } from "$lib/components/ui/button";
  import Highlight, { LineNumbers, HighlightAuto } from "svelte-highlight";
  import java from "svelte-highlight/languages/java";
  import onedark from "svelte-highlight/styles/onedark";

  let data: { value: string, label: string }[] = [];
  const csaFileStructure = writable(new Map<string, Map<string, FileEntry[]>>());
  let code = `System.out.println("Hello, World!");\nSystem.out.println("Default values are fun!");`;

  let current_path = 'None';

  interface FileEntry {
    path: string;
    mode: string;
    type: string;
    sha: string;
    url: string;
    size?: number;
  }
  
  interface GitHubBlob {
    sha: string;
    node_id: string;
    size: number;
    url: string;
    content: string;
    encoding: string;
  }

  async function fetch_units() {
    try {
      const response = await fetch('https://api.github.com/repos/Washiil/CSA-Savior/git/trees/main');
      const responseData = await response.json();

      for (let i = 0; i < responseData.tree.length; i++) {
        if (responseData.tree[i].type === 'tree') {
          data.push({value: responseData.tree[i].url, label: responseData.tree[i].path});
        }
      }
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }

  async function fetch_files(url: string) {
    let updated_struct = new Map<string, Map<string, FileEntry[]>>();
    try {
      const response = await fetch(url + "?recursive=0");
      const data: { tree: FileEntry[] } = await response.json();

      data.tree.forEach(entry => {
        const sections = entry.path.split('/');
        if (sections.length === 1) {
          if (!updated_struct.has(sections[0])) updated_struct.set(sections[0], new Map<string, FileEntry[]>());
        }
        if (sections.length === 2) {
          if (updated_struct.has(sections[0])) updated_struct.get(sections[0])!.set(sections[1], []);
        }
        if (sections.length === 3) {
          if (updated_struct.has(sections[0])) {
            if (updated_struct.get(sections[0])!.has(sections[1])) {
              updated_struct.get(sections[0])!.get(sections[1])!.push(entry);
            }
          };
        }
      });
    } catch (error) {
      console.error('Error fetching data:', error);
    }
    csaFileStructure.set(updated_struct);
  }

  async function update_file_content(url: string, name: string) {
    const response = await fetch(url);
    const responseData: GitHubBlob = await response.json();

    let outstring = '';
    responseData.content.split('\n').forEach(element => {
      outstring += atob(element);
    });

    current_path = name;
    code = outstring;
  }

  onMount(fetch_units);
</script>

<svelte:head>
  {@html onedark}
</svelte:head>

<div class='flex flex-col h-screen w-screen'>
  <div class='flex flex-row flex-grow p-1'>
    <div class='w-50 p-1 bg-zinc-900 rounded-md'>
      <span class='container mx-auto text-center font-mono font-bold text-2xl'>
        CSA Savior
      </span>

      <Separator class='my-2'/>

      <Select.Root>
        <Select.Trigger class="w-[180px]">
          <Select.Value placeholder="Select Unit" />
        </Select.Trigger>
        <Select.Content>
          <Select.Group>
            <Select.Label>Unit</Select.Label>
            {#each data as folder}
              <Select.Item on:click={() => fetch_files(folder.value)} value={folder.value} label={folder.label}>{folder.label}</Select.Item>
            {/each}
          </Select.Group>
        </Select.Content>
        <Select.Input name="Unit" />
      </Select.Root>

      <Separator class='my-2'/>

      <div>
        {#each $csaFileStructure as [chapter, units]}
          <Accordion.Root>
            <Accordion.Item value="{chapter}">
              <Accordion.Trigger>{chapter}</Accordion.Trigger>
              <Accordion.Content>
                {#each units as unit}
                  <h2 class='font-bold'>{unit[0]}</h2>
                  <div class='flex flex-col items-start'>
                    {#each unit[1] as file}
                      <Button variant='link' on:click={() => update_file_content(file.url, file.path)}>{file.path.split('/').slice(-1)}</Button>
                    {/each}
                  </div>
                  <Separator class='my-2'/>
                {/each}
              </Accordion.Content>
            </Accordion.Item>
          </Accordion.Root>
        {/each}
      </div>
    </div>
    <div class='m-1 flex flex-col flex-grow'>
      <div class='p-2'>
        <span class='text-2xl font-mono'>
          {current_path}
        </span>
      </div>
      <div class='flex-grow bg-zinc-900 rounded-md p-1'>
        <Highlight language={java} {code} let:highlighted>
          <LineNumbers {highlighted} wrapLines />
        </Highlight>
      </div>
    </div>
  </div>
</div>
