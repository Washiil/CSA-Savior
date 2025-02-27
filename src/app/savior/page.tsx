"use client";

import { RepoProvider } from "@/context/RepoContext";
import UnitSelector from "@/components/UnitSelector";
import FileTree from "@/components/FileTree";
import CodeViewer from "@/components/CodeViewer";

import Wave from "../../components/Wave";
import Link from "next/link";

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
            <div className="flex flex-col sm:flex-row h-full">
              <div className="flex flex-col px-4 w-full sm:w-1/3 overflow-y-auto">
                <div className="flex flex-col sm:flex-row justify-between">
                  <Link
                    href={"/"}
                    className="transition-all duration-700 text-3xl font-mono p-2 sm:py-6 text-center font-bold cursor-pointer text-purple-600 sm:text-white sm:hover:underline hover:scale-105"
                  >
                    CSA-Savior
                  </Link>
                  <Link
                    href="https://github.com/Washiil/CSA-Savior"
                    className="font-mono hidden sm:flex justify-center items-center m-4 p-3 transition-all duration-700 outline-1 outline outline-zinc-600/70 text-white rounded-2xl text-md hover:scale-[115%]"
                  >
                    Star ⭐
                  </Link>
                </div>

                <UnitSelector />
                <FileTree />

              </div>
              <div className="w-[1px] sm:h-full bg-zinc-600/70" />
                <div className="p-2 w-full sm:w-2/3 h-full overflow-y-auto">
                  <CodeViewer />
                </div>
            </div>
          </div>
        </div>
      </div>
    </RepoProvider>
  );
}
