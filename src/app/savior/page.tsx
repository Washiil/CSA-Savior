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
                <div className="w-[98%] h-[98%] backdrop-blur-xl outline-1 outline outline-zinc-600/45a  rounded-2xl">
                    <div className="h-full">
                        <div className="col-span-2">
                            <h1 className="text-3xl font-mono p-5">CSA-Savior</h1>
                        </div>

                        <div className="w-[1px] bg-white"/>
                    </div>
                </div>
            </div>
        </div>
    )
}