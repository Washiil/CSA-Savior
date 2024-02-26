<script lang="ts">
    import * as Select from "$lib/components/ui/select";
    let count = 0;
</script>

<h1>Counter: {count}</h1>
<button on:click={() => count++}>Increase</button>
<button on:click={() => count--}>Decrease</button>

<Select.Root>
    <Select.Trigger class="w-[180px]">
      <Select.Value placeholder="Theme" />
    </Select.Trigger>
    <Select.Content>
      <Select.Item value="light">Light</Select.Item>
      <Select.Item value="dark">Dark</Select.Item>
      <Select.Item value="system">System</Select.Item>
    </Select.Content>
  </Select.Root>