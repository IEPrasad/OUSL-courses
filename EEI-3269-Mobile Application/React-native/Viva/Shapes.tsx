// Shapes.tsx
import React from 'react';

// Interface for Shape Props
interface ShapeProps {
  name: string;
  area: number;
}

export const Shape = ({ name, area }: ShapeProps) => {
  return (
    <div>
      <h3>{name}</h3>
      <p>Area: {area}</p>
    </div>
  );
};

// Circle Component
export const Circle = ({ radius }: { radius: number }) => {
  const area = Math.PI * radius * radius;
  return <Shape name="Circle" area={area} />;
};

// Rectangle Component
export const Rectangle = ({ width, height }: { width: number; height: number }) => {
  const area = width * height;
  return <Shape name="Rectangle" area={area} />;
};
