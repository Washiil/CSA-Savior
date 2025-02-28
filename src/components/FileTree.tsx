"use client";

import { useState } from "react";
import { useRepo } from "@/context/RepoContext";
import { fetchFileContent } from "@/lib/githubAPI";
import { FileEntry } from "@/types/GithubCTX";

export default function FileTree() {
  const { fileStructure, setCurrentFile } = useRepo();
  const [expandedChapters, setExpandedChapters] = useState<Set<string>>(
    new Set(),
  );
  const [expandedUnits, setExpandedUnits] = useState<Map<string, boolean>>(
    new Map(),
  );

  const toggleChapter = (chapter: string) => {
    const newExpanded = new Set(expandedChapters);
    if (newExpanded.has(chapter)) {
      newExpanded.delete(chapter);
    } else {
      newExpanded.add(chapter);
    }
    setExpandedChapters(newExpanded);
  };

  const toggleUnit = (chapter: string, unit: string) => {
    const newExpanded = new Map(expandedUnits);
    const key = `${chapter}-${unit}`;

    if (newExpanded.has(key)) {
      newExpanded.delete(key);
    } else {
      newExpanded.set(key, true);
    }

    setExpandedUnits(newExpanded);
  };

  const handleFileClick = async (file: FileEntry) => {
    try {
      const content = await fetchFileContent(file.url);
      setCurrentFile({
        path: file.path,
        content,
      });
    } catch (error) {
      console.error("Error loading file:", error);
    }
  };

  // Convert Map to Array for rendering
  const chaptersArray = Array.from(fileStructure.entries());

  return (
    <div className="mt-4 text-white">
      {chaptersArray.map(([chapter, units]) => (
        <div key={chapter} className="mb-2">
          <button
            className="transition-all duration-700 w-full text-left p-2 bg-zinc-800 rounded-md font-bold flex justify-between items-center hover:translate-x-2"
            onClick={() => toggleChapter(chapter)}
          >
            <span>{chapter}</span>
            <span>{expandedChapters.has(chapter) ? "−" : "+"}</span>
          </button>

          {expandedChapters.has(chapter) && (
            <div className="transition-all sm:ml-2 outline outline-1 rounded-2xl outline-zinc-600/70 mt-2 p-2">
              {Array.from(units.entries()).map(([unit, files]) => (
                <div key={unit} className="mb-2">
                  <button
                    className="w-full text-left p-1 font-semibold flex justify-between items-center"
                    onClick={() => toggleUnit(chapter, unit)}
                  >
                    <span>{unit}</span>
                    <span>
                      {expandedUnits.has(`${chapter}-${unit}`) ? "−" : "+"}
                    </span>
                  </button>

                  {expandedUnits.has(`${chapter}-${unit}`) && (
                    <div className="ml-2">
                      {files.map((file: FileEntry) => (
                        <button
                          key={file.path}
                          className="transition-all duration-500 w-full text-left p-1 text-white hover:underline sm:hover:translate-x-2"
                          onClick={() => handleFileClick(file)}
                        >
                          {file.path.split("/").pop()}
                        </button>
                      ))}
                    </div>
                  )}
                </div>
              ))}
            </div>
          )}
        </div>
      ))}
    </div>
  );
}
