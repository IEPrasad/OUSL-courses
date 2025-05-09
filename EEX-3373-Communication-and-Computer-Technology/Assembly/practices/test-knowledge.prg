(* This is for the check the knowledge of the assembly with the SEPSIM with simple program *)

loadacc #3
storeacc 0x81
loadacc #5
sub 0x81
loadacc #9
js
loadacc #10
storeacc 0x84
nop
loadacc #7
storeacc 0x85
nop

(* read this code again and again and try to run this inside of the SEPSIM, then you will understand properly *)


--------


Key Observations:
  1. Purpose: The program demonstrates basic operations like loading, storing, arithmetic subtraction, 
  and a possible jump (js) to a different routine.

  2. Registers and Memory Interaction:
  Immediate values (#value) are loaded into the accumulator.
  Values in the accumulator are stored in specific memory addresses (0x81, 0x84, 0x85).
  Subtraction involves reading a value from memory and modifying the accumulator.
  
  3. NOP Instructions: These are used to introduce delays or act as placeholders.

What to Do:

Run this code in SEPSIM to observe the following:
The changes in the accumulator after each instruction.
The effects of storing and retrieving values from memory addresses.
The behavior of the js (jump) instruction in your specific SEPSIM implementation.

** By stepping through the code and observing the memory and accumulator, you'll better 
understand how SEPSIM handles each instruction.














