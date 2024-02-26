
<script lang="ts">

  import "../app.pcss";
  import { Separator } from "$lib/components/ui/separator";
  import * as Select from "$lib/components/ui/select";
  import { onMount } from "svelte";
  import { buttonVariants } from "$lib/components/ui/button";

  let data: { value: string, label: string }[] = [];
  let units: { values: string, label: string}[] = [];
  const current_structure = new Map<string, FileEntry[]>();
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

  async function fetch_files(url: string) {
    current_structure.clear();
    try {
      const response = await fetch(url);
      const data: { tree: FileEntry[] } = await response.json();

      data.tree.forEach(entry => {
        const sections = entry.path.split('/');
        const section = sections[0];

        if (!current_structure.has(section)) {
          current_structure.set(section, []);
        }

        current_structure.get(section)!.push(entry);
      });
    } catch (error) {
      console.error('Error fetching data:', error);
    }
    console.log(current_structure);
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
        {#each Array.from(current_structure) as [section, entries]}
        {() => {console.log('hello world')}}
        <h1>TEST</h1>
          <section>
            <h2>{section}</h2>
            <ul>
              {#each entries as entry}
                <li>{entry.path}</li>
              {/each}
            </ul>
          </section>
        {/each}
        {#each current_structure as unit}
          <h1>h1</h1>
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
