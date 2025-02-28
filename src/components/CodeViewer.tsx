"use client";
import { useRepo } from "@/context/RepoContext";
import { useState, useEffect } from "react";
import SyntaxHighlighter from "react-syntax-highlighter";
import { atomOneDark } from "react-syntax-highlighter/dist/esm/styles/hljs";

export default function CodeViewer() {
  const { currentFile } = useRepo();
  const [copied, setCopied] = useState<boolean>(false);
  const [windowWidth, setWindowWidth] = useState(1000);

  // Reset copied state after 2 seconds
  useEffect(() => {
    if (copied) {
      const timeout = setTimeout(() => {
        setCopied(false);
      }, 2000);
      return () => clearTimeout(timeout);
    }
  }, [copied]);

  useEffect(() => {
    const handleResize = () => {
      setWindowWidth(window.innerWidth);
    };

    window.addEventListener("resize", handleResize);

    // Clean up the event listener when the component unmounts
    return () => {
      window.removeEventListener("resize", handleResize);
    };
  }, []);

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
    <div className="flex flex-col h-full w-full">
      <div className="flex justify-between items-center">
        <h2 className="text-2xl font-mono truncate">
          {currentFile.path.split("/").map((section) => {
            if (section.indexOf("java") != -1) {
              return (
                <span
                  key={section}
                  className="transition-all duration-500 hover:text-purple-600"
                >
                  {section}
                </span>
              );
            } else {
              return (
                <span
                  key={section}
                  className="transition-all duration-500 hover:text-purple-600"
                >
                  {section}/
                </span>
              );
            }
          })}
        </h2>
        <button
          onClick={copyToClipboard}
          className="px-4 py-2 bg-zinc-800 text-white rounded-md hover:bg-zinc-700 transition flex-shrink-0 ml-2"
        >
          {copied ? "Copied!" : "Copy Code"}
        </button>
      </div>
      <div className="flex-1 bg-zinc-900 rounded-md p-1 mt-2 w-full max-w-full">
        <div className="overflow-x-auto w-full max-w-full">
          <SyntaxHighlighter
            language={getLanguage()}
            style={atomOneDark}
            showLineNumbers={windowWidth > 687}
            wrapLines={false}
            customStyle={{
              margin: 0,
              padding: "16px",
              borderRadius: "6px",
              background: "#18181b",
              width: "max-content",
              maxWidth: "none",
            }}
          >
            {currentFile.content}
          </SyntaxHighlighter>
        </div>
      </div>
    </div>
  );
}
