// Constants.tsx
export const PI = 3.14159;

export enum Color {
  Red = "Red",
  Green = "Green",
  Blue = "Blue",
}

// A React Component to Display Colors
export const ColorDisplay = ({ color }: { color: Color }) => {
  return <div style={{ color: color.toLowerCase() }}>Selected Color: {color}</div>;
};
