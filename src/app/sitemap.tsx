import type { MetadataRoute } from 'next'
 
export default function sitemap(): MetadataRoute.Sitemap {
  return [
    {
      url: 'https://washiil.github.io/csa-savior',
      lastModified: new Date(),
      changeFrequency: 'yearly',
      priority: 1,
    },
    {
      url: 'https://washiil.github.io/csa-savior/savior',
      lastModified: new Date(),
      changeFrequency: 'yearly',
      priority: 0.8,
    }
  ]
}