// MathUtils.tsx
import React from 'react';

export const Add = ({ a, b }: { a: number; b: number }) => {
  return <div>Addition: {a + b}</div>;
};

export const Subtract = ({ a, b }: { a: number; b: number }) => {
  return <div>Subtraction: {a - b}</div>;
};
