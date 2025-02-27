"use client";

import { RepoProvider } from "@/context/RepoContext";
import UnitSelector from "@/components/UnitSelector";
import FileTree from "@/components/FileTree";
import CodeViewer from "@/components/CodeViewer";

import Wave from "../../components/Wave";
import { fetchFileContent } from "@/lib/githubAPI";

export default function Savior() {
  return (
    <RepoProvider>
      <div className="h-screen w-screen">
        <Wave
          stretch={3}
          fill="#a036c2"
          animationDuration={15}
          numberOfWaves={4}
          minHeight={500}
          maxHeight={3000}
          className="w-screen h-screen absolute left-0 bottom-0 overflow-hidden -z-10"
        />
        {/*<Navbar/>*/}

        <div className="w-full h-full flex justify-center items-center">
          <div className="w-[98%] h-[98%] backdrop-blur-xl outline-1 outline outline-zinc-600/70 rounded-2xl">
            <div className="flex h-full">
              <div className="flex flex-col px-4 w-1/3 overflow-y-auto">
                <h1 className="text-3xl font-mono py-6 w-full text-center font-bold">
                  CSA-Savior
                </h1>
                <UnitSelector />
                <FileTree />
              </div>

              <div className="w-[1px] h-full bg-gradient-to-b from-transparent via-white to-transparent" />

              <div className="p-5 w-full h-full flex flex-col">
                <div className="w-full h-full overflow-y-auto no-scrollbar">
                  <CodeViewer />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </RepoProvider>
  );
}

