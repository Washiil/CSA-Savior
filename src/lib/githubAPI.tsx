import { Unit, FileEntry, GitHubBlob } from "@/types/GithubCTX";

interface GitHubTreeItem {
  path: string;
  mode: string;
  type: string;
  sha: string;
  url: string;
  size?: number;
}

interface GitHubTreeResponse {
  tree: GitHubTreeItem[];
}

/**
 * Fetches units (top-level directories) from the repository
 * @returns {Promise<Unit[]>} Array of unit objects
 */
export async function fetchUnits(): Promise<Unit[]> {
  try {
    const response = await fetch(
      "https://api.github.com/repos/Washiil/CSA-Savior/git/trees/main",
    );
    const responseData = await response.json();

    const units: Unit[] = responseData.tree
      .filter((item: GitHubTreeItem) => item.type === "tree")
      .map((item: GitHubTreeItem) => ({
        value: item.url,
        label: item.path,
      }));

    return units;
  } catch (error) {
    console.error("Error fetching units:", error);
    return [];
  }
}

/**
 * Fetches file structure for a specific unit
 * @param {string} url - The GitHub API URL for the unit's tree
 * @returns {Promise<Map<string, Map<string, FileEntry[]>>>} - Nested map structure of files
 */
export async function fetchFiles(
  url: string,
): Promise<Map<string, Map<string, FileEntry[]>>> {
  const fileStructure = new Map<string, Map<string, FileEntry[]>>();

  try {
    const response = await fetch(`${url}?recursive=0`);
    const data: GitHubTreeResponse = await response.json();

    data.tree.forEach((entry: GitHubTreeItem) => {
      const sections = entry.path.split("/");

      if (sections.length === 1) {
        if (!fileStructure.has(sections[0])) {
          fileStructure.set(sections[0], new Map<string, FileEntry[]>());
        }
      }

      if (sections.length === 2) {
        if (fileStructure.has(sections[0])) {
          fileStructure.get(sections[0])?.set(sections[1], []);
        }
      }

      if (sections.length === 3) {
        if (fileStructure.has(sections[0])) {
          const chapterMap = fileStructure.get(sections[0]);
          if (chapterMap && chapterMap.has(sections[1])) {
            const files = chapterMap.get(sections[1]);
            if (files) {
              files.push(entry as FileEntry);
            }
          }
        }
      }
    });

    return fileStructure;
  } catch (error) {
    console.error("Error fetching files:", error);
    return new Map();
  }
}

/**
 * Fetches content of a specific file
 * @param {string} url - GitHub API URL for the file
 * @returns {Promise<string>} - Decoded file content
 */
export async function fetchFileContent(url: string): Promise<string> {
  try {
    const response = await fetch(url);
    const responseData: GitHubBlob = await response.json();

    let content = "";
    responseData.content.split("\n").forEach((element) => {
      content += atob(element);
    });

    return content;
  } catch (error) {
    console.error("Error fetching file content:", error);
    return "";
  }
}
