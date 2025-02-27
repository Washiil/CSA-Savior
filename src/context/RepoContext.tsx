"use client";

import { createContext, useContext, useState, ReactNode } from "react";
import {
  Unit,
  FileEntry,
  CurrentFile,
  RepoContextType,
} from "@/types/GithubCTX";

const RepoContext = createContext<RepoContextType | null>(null);

export function RepoProvider({ children }: { children: ReactNode }) {
  const [units, setUnits] = useState<Unit[]>([]);
  const [fileStructure, setFileStructure] = useState<
    Map<string, Map<string, FileEntry[]>>
  >(new Map());
  const [currentFile, setCurrentFile] = useState<CurrentFile>({
    path: "README.md",
    content: "",
  });

  return (
    <RepoContext.Provider
      value={{
        units,
        setUnits,
        fileStructure,
        setFileStructure,
        currentFile,
        setCurrentFile,
      }}
    >
      {children}
    </RepoContext.Provider>
  );
}

export function useRepo(): RepoContextType {
  const context = useContext(RepoContext);
  if (!context) {
    throw new Error("useRepo must be used within a RepoProvider");
  }
  return context;
}
