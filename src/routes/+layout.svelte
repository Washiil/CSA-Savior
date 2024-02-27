
<script lang="ts">
  import "../app.pcss";
  import { writable } from "svelte/store";
  import { Separator } from "$lib/components/ui/separator";
  import * as Select from "$lib/components/ui/select";
  import * as Accordion from "$lib/components/ui/accordion";
  import { onMount } from "svelte";
  import { Button } from "$lib/components/ui/button";
  import { buttonVariants } from "$lib/components/ui/button";

  let data: { value: string, label: string }[] = [];
  const dynamic_file_structure = writable(new Map<string, FileEntry[]>());
  const csaFileStructure = writable(new Map<string, Map<string, FileEntry[]>>());

  let selected_url = '';
  let current_path = 'None';

  interface FileEntry {
    path: string;
    mode: string;
    type: string;
    sha: string;
    url: string;
    size?: number;
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


  // Need to refactor this
  async function fetch_files(url: string) {
    dynamic_file_structure.set(new Map());
    let new_structure = new Map<string, FileEntry[]>();
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

        if (entry.type === 'blob') {
          if (!new_structure.has(sections[0])) {
            new_structure.set(sections[0], []);
          }
          
          new_structure.get(sections[0])!.push(entry);
        }
      });
    } catch (error) {
      console.error('Error fetching data:', error);
    }
    csaFileStructure.set(updated_struct);
    dynamic_file_structure.set(new_structure);
  }

  onMount(fetch_units);
</script>

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
                  {#each unit[1] as file}
                    <Button variant='link'>{file.path.split('/').slice(-1)}</Button>
                  {/each}
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
      <div class='flex-grow p-2 bg-zinc-900 rounded-md'>
        <slot></slot>
      </div>
    </div>
  </div>
</div>
