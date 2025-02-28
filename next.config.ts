import type { NextConfig } from "next";

const nextConfig: NextConfig = {
  pageExtensions: ["ts", "tsx"],
  output: "export",
  images: {
    unoptimized: true,
  },
};

export default nextConfig;
