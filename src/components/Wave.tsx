"use client";

interface WaveProps {
  width?: number;
  fill?: string;
  stretch?: number;
  animationDuration?: number;
  numberOfWaves?: number;
  minHeight?: number;
  maxHeight?: number;
  className?: string;
}

const Wave: React.FC<WaveProps> = ({
  width = 1000,
  stretch = 1, // Higher values = smoother waves
  fill = "#3B82F6",
  animationDuration = 15,
  numberOfWaves = 3,
  minHeight = 20,
  maxHeight = 50,
  className = "",
}) => {
  const generateRandomWavePath = (index: number): string => {
    // Adjust number of segments based on stretch factor
    // Fewer segments = smoother waves
    const height = 9000;
    const segments = stretch;
    const segmentWidth = width / segments;

    // Generate random heights for the control points
    const points = [];
    for (let i = 0; i <= segments; i++) {
      const x = i * segmentWidth;

      // Use different random heights based on wave index for variation
      const waveHeightFactor = 0.7 + index * 0.15;
      const randomHeight =
        minHeight + Math.random() * (maxHeight - minHeight) * waveHeightFactor;

      points.push({ x, y: randomHeight });
    }

    // Build the SVG path
    let path = `M 0 ${height} L 0 ${height - points[0].y}`;

    for (let i = 0; i < segments; i++) {
      const cpDistance = segmentWidth / 3;

      const cp1x = Math.min(points[i].x + cpDistance, points[i + 1].x);
      const cp1y = height - points[i].y;

      const cp2x = Math.max(points[i + 1].x - cpDistance, points[i].x);
      const cp2y = height - points[i + 1].y;

      const x = points[i + 1].x;
      const y = height - points[i + 1].y;

      path += ` C ${cp1x} ${cp1y}, ${cp2x} ${cp2y}, ${x} ${y}`;
    }

    path += ` L ${width} ${height} Z`;
    return path;
  };

  const paths = Array.from({ length: numberOfWaves }, (_, i) =>
    generateRandomWavePath(i),
  );

  const getOpacity = (index: number) => {
    // Make each successive wave more transparent
    return 1 - index * (0.7 / numberOfWaves);
  };

  return (
    <div className={`${className}`}>
      <svg
        width="100%"
        height="100%"
        preserveAspectRatio="none"
        viewBox={`0 0 ${width} 9000`}
        className="w-full h-full transition-all duration-1000 hover:opacity-90"
      >
        {paths.map((path, index) => (
          <path
            key={index}
            d={path}
            fill={fill}
            opacity={getOpacity(index)}
            className="transition-all duration-300"
          >
            <animate
              attributeName="d"
              values={`${path};${generateRandomWavePath(index)};${path}`}
              dur={`${animationDuration + index * 2}s`}
              repeatCount="indefinite"
            />
          </path>
        ))}
      </svg>
    </div>
  );
};

export default Wave;
