"use client";

import { useEffect } from "react";
import { useRepo } from "@/context/RepoContext";
import { fetchUnits, fetchFiles } from "@/lib/githubAPI";
import { Unit } from "@/types/GithubCTX";

export default function UnitSelector() {
  const { units, setUnits, setFileStructure } = useRepo();

  useEffect(() => {
    const loadUnits = async () => {
      const data = await fetchUnits();
      setUnits(data);
    };

    loadUnits();
  }, [setUnits]);

  const handleUnitChange = async (e: React.ChangeEvent<HTMLSelectElement>) => {
    const url = e.target.value;
    if (!url) return;

    const files = await fetchFiles(url);
    setFileStructure(files);
  };

  return (
    <div className="w-full">
      <select
        className="w-full bg-zinc-800 text-white p-4 rounded-md"
        onChange={handleUnitChange}
        defaultValue=""
      >
        <option value="" disabled>
          Select Unit
        </option>
        {units.map((unit: Unit) => (
          <option key={unit.value} value={unit.value}>
            {unit.label}
          </option>
        ))}
      </select>
    </div>
  );
}
