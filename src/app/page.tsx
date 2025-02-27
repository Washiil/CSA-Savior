import Image from "next/image";
import Wave from "../components/Wave";
import Link from "next/link";

export default function Home() {
  return (
    // Need to redo the wave class
    <div className="flex flex-col h-screen w-screen items-center bg-gradient-to-tl from-black via-zinc-600/20 to-black">
      <Wave
        stretch={3}
        fill="#a036c2"
        animationDuration={15}
        numberOfWaves={4}
        minHeight={500}
        maxHeight={3000}
        className="w-screen h-screen absolute left-0 bottom-0 overflow-hidden -z-10"
      />

      <div className="mx-14 transition-all backdrop-blur-xl duration-700 w-[95%] my-14 text-white rounded-2xl p-8">
        <h1 className="transition-all duration-500 font-mono text-4xl md:text-6xl font-bold">
          CSA-Savior
        </h1>
        <br />

        <p className="text-lg text-zinc-400">
          Welcome or welcome back. It's the site you know and love just with a
          brand new web interface!
        </p>

        {/* Button Bar*/}
        <div className="flex mt-6 flex-row justify-items-start space-x-4 font-mono">
          <div className="flex space-x-6">
            <Link
              href="https://github.com/Washiil/CSA-Savior"
              className="transition-all duration-700 outline-1 outline outline-black bg-white text-black rounded-2xl text-md py-2 px-4 hover:scale-[115%]"
            >
              Star ⭐
            </Link>
            <Link
              href="https://washi-dev.vercel.app/projects"
              className="transition-all duration-700 outline-1 outline outline-black bg-white text-black rounded-2xl text-md py-2 px-4 hover:scale-[115%]"
            >
              Projects
            </Link>
          </div>
        </div>

        <div className="flex mt-10 justify-center font-mono font-medium pt-12">
          <Link
            href="/savior"
            className="mt-3 text-2xl md:text-3xl transition-all duration-700 outline-1 outline outline-black bg-white text-black rounded-lg text-md py-2 px-4 hover:scale-[115%]"
          >
            Start Here→
          </Link>
        </div>
      </div>
    </div>
  );
}
