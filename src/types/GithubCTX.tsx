export interface Unit {
  value: string;
  label: string;
}

export interface FileEntry {
  path: string;
  mode: string;
  type: string;
  sha: string;
  url: string;
  size?: number;
}

export interface GitHubBlob {
  sha: string;
  node_id: string;
  size: number;
  url: string;
  content: string;
  encoding: string;
}

export interface CurrentFile {
  path: string;
  content: string;
}

export interface RepoContextType {
  units: Unit[];
  setUnits: React.Dispatch<React.SetStateAction<Unit[]>>;
  fileStructure: Map<string, Map<string, FileEntry[]>>;
  setFileStructure: React.Dispatch<
    React.SetStateAction<Map<string, Map<string, FileEntry[]>>>
  >;
  currentFile: CurrentFile;
  setCurrentFile: React.Dispatch<React.SetStateAction<CurrentFile>>;
}
