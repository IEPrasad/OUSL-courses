// App.tsx
import React from 'react';
import { Add, Subtract } from './components/MathUtils';
import { Circle, Rectangle } from './components/Shapes';
import { PI, Color, ColorDisplay } from './components/Constants';

const App = () => {
  return (
    <div style={{ padding: 20 }}>
      <h1>TypeScript React Example</h1>

      {/* Using MathUtils Components */}
      <Add a={5} b={10} />
      <Subtract a={10} b={5} />

      {/* Using Shapes Components */}
      <h2>Shapes</h2>
      <Circle radius={5} />
      <Rectangle width={4} height={5} />

      {/* Using Constants and Enum */}
      <h2>Constants</h2>
      <p>Value of PI: {PI}</p>
      <ColorDisplay color={Color.Green} />
    </div>
  );
};

export default App;
