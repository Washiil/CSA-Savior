import type { NextConfig } from "next";

const nextConfig: NextConfig = {
  pageExtensions: ["ts", "tsx"],
  basePath: "/CSA-Savior",
  output: "export",
  reactStrictMode: true,
};

export default nextConfig;
