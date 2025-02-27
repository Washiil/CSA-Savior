"use client";

import { useRepo } from "@/context/RepoContext";
import { useState, useEffect } from "react";
import SyntaxHighlighter from "react-syntax-highlighter";
import { atomOneDark } from "react-syntax-highlighter/dist/esm/styles/hljs";

export default function CodeViewer() {
  const { currentFile } = useRepo();
  const [copied, setCopied] = useState<boolean>(false);

  // Reset copied state after 2 seconds
  useEffect(() => {
    if (copied) {
      const timeout = setTimeout(() => {
        setCopied(false);
      }, 2000);

      return () => clearTimeout(timeout);
    }
  }, [copied]);

  const copyToClipboard = async () => {
    try {
      await navigator.clipboard.writeText(currentFile.content);
      setCopied(true);
    } catch (error) {
      console.error("Unable to copy text to clipboard:", error);
    }
  };

  // Determine language for syntax highlighting
  const getLanguage = (): string => {
    const extension = currentFile.path.split(".").pop()?.toLowerCase();
    if (extension === "java") return "java";
    if (extension === "md") return "markdown";
    return "java"; // Default to Java
  };

  return (
    <div className="flex flex-col h-full">
      <div className="flex justify-between items-center p-2">
        <h2 className="text-2xl font-mono">{currentFile.path}</h2>
        <button
          onClick={copyToClipboard}
          className="px-4 py-2 bg-zinc-800 text-white rounded-md hover:bg-zinc-700 transition"
        >
          {copied ? "Copied!" : "Copy Code"}
        </button>
      </div>

      <div className="flex-1 bg-zinc-900 rounded-md p-1 mt-2 overflow-y-auto overflow-x-auto">
        <SyntaxHighlighter
          language={getLanguage()}
          style={atomOneDark}
          showLineNumbers={true}
          wrapLines={true}
          customStyle={{
            margin: 0,
            padding: "16px",
            borderRadius: "6px",
            background: "#18181b",
          }}
        >
          {currentFile.content}
        </SyntaxHighlighter>
      </div>
    </div>
  );
}
