/*
III. Cubic polynomials are used in various areas of mathematics and science, 
     including physics, engineering, and economics. A polynomial is an algebraic expression (equation) with variables and constants with exponents as whole numbers. Following equation is such a polynomial.

    y = 4x3 + 8x2 + 2x + 2
    
    Considering the Accumulator-Based Processor Architecture, draw a single flowchart to show the algorithm of the assembly program to calculate the answer (y) of the above polynomial. Store the output of the equation ‘y’ in the 0x71 memory location. Assume the value of ‘x’ is stored in the 0x70 memory location. Mention if you made any assumptions.

    Important: Use the standard symbols/ shapes to draw the flowchart. Assume the size of the memory is enough to store your program. (15 Marks)

IV. Write an assembly program for the above (Q1, III) algorithm. Refer to the ISA 
    in Appendix A to write the program.

*/

loadacc #5
storeacc 0x70
mul 0x70
mul 0x70
mul 4
storeacc 0x75 // store the value temporary
loadacc 0x70
mul 0x70
mul 8
add 0x75
storeacc 0x75
loadacc 0x70
mul #2
add #2
add 0x75
sotreacc 0x71 // store the final value (y) in the memory location as the 0x71

