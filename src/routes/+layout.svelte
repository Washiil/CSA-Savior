
<script lang="ts">
  
  import "../app.pcss";
  import { Separator } from "$lib/components/ui/separator";
  import * as Select from "$lib/components/ui/select";
  import { onMount } from "svelte";
  import { buttonVariants } from "$lib/components/ui/button";

  let data: { value: string, label: string }[] = [];
  let units: { values: string, label: string}[] = [];
  let selected_url = '';

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
    try {
      const response = await fetch(url);
      const responseData = await response.json();

      for (let i = 0; i < responseData.tree.length; i++) {
        units.push({values: responseData.tree[i].url, label: responseData.tree[i].path});
      }
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }

  function handle_unit_selection(event: CustomEvent) {
    console.log('hello worlld!');
    if (event.target) {
      console.log(event.target);
      selected_url = 'test';
    }
  }

  onMount(fetch_units);
</script>

<div class='flex flex-col h-screen w-screen'>
  <div class='flex flex-row flex-grow p-2'>
    <div class='w-50 m-1 p-2 bg-zinc-900 text-center font-mono font-bold text-3xl rounded-md'>
      CSA Savior

      <Separator class='my-2'/>

      <Select.Root>
        <Select.Trigger class="w-[180px]">
          <Select.Value placeholder="Select Unit" />
        </Select.Trigger>
        <Select.Content>
          <Select.Group>
            <Select.Label>Unit</Select.Label>
            {#each data as folder}
              <Select.Item value={folder.value} label={folder.label}>{folder.label}</Select.Item>
            {/each}
          </Select.Group>
        </Select.Content>
        <Select.Input name="Unit" />
      </Select.Root>

      <Separator class='my-2'/>
      
      <div>
        {#each units as unit}
          <button on:click={() => console.log(unit)}>{unit}</button>
        {/each}
      </div>
    </div>
    <div class='m-1 flex flex-col flex-grow'>
      <div class='p-2'>
        Homework Assignment/main.java
      </div>
      <div class='flex-grow p-2 bg-zinc-900 rounded-md'>
        <slot></slot>
      </div>
    </div>
  </div>
</div>
