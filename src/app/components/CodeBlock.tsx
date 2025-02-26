'use client'

import React, { useEffect, useRef } from 'react';
import Prism from 'prismjs';
import 'prismjs/themes/prism-tomorrow.css';
import 'prismjs/components/prism-javascript';

interface CodeBlockProps {
  children: string; // Explicitly define children as a string
  language?: string; // Optional language prop, default to 'javascript'
}

const CodeBlock: React.FC<CodeBlockProps> = ({ children, language = 'javascript' }) => {
  const preRef = useRef<HTMLPreElement>(null);

  useEffect(() => {
    if (preRef.current) {
      Prism.highlightElement(preRef.current);
    }
  }, [children, language]);

  return (
    <pre ref={preRef} className={`language-${language} line-numbers h-full w-full`}>
      <code>{children}</code>
    </pre>
  );
};

export default CodeBlock;