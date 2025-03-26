import type { NextConfig } from "next";

const nextConfig: NextConfig = {
  pageExtensions: ["ts", "tsx"],
  output: "export",
  basePath: "/CSA-Savior",
  reactStrictMode: true,
};

export default nextConfig;
