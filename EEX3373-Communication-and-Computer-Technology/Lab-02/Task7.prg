a and b are arbitrary positive integer values stored in the memory locations as follows,

0x80  a
0x81  b
0x82  0
0x83  0

If a > b increment the value in 0x82 If a = b increment the value in 0x83
Draw a flowchart to show the algorithm of the assembly program (accumulator-based computer
architecture) to perform the above task.
Write an assembly language program to the above function and simulate the program in SEPSim.

loadacc #5
storeacc 0x80
loadacc #5
sub 0x80
loadacc #9
js
loadacc 0x83
inc
nop
loadacc #9
jz
loadacc 0x82
inc
nop

// This is also not permenetly sure code !
