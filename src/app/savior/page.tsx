import CodeBlock from "../components/CodeBlock";
import Sidebar from "../components/Sidebar";
import Wave from "../components/Wave";

export default function Savior() {
    return (
        <div className="h-screen w-screen">
            <Sidebar/>
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
                        <div className="flex flex-col px-4 w-1/3">
                            <h1 className="text-3xl font-mono py-6 w-full text-center font-bold">CSA-Savior</h1>
                            <p>Item</p>
                        </div>

                        <div className="w-[1px] h-full bg-gradient-to-b from-transparent via-white to-transparent"/>

                        <div className="p-5 w-full h-full flex flex-col">
                            <h1 className="text-xl py-3 font-mono">Location/In/File/Structure</h1>
                            <div className="w-full h-full overflow-y-auto">
                                <CodeBlock language="javascript">console.log("Hello world!");</CodeBlock>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}