Lab Task 8:
(* ● Complete the following task before participating for the lab viva. *)

a,b and c are three positive integer numbers

Store a at location 0x80
Store b at location 0x81
Store c at location 0x82

Find the largest value from above three numbers and store the value in location 0x83.

Draw a flowchart to show the algorithm of the assembly program (accumulator-based computer
architecture) to perform the above task.
Write an assembly language program to the above function and simulate the program in SEPSim.


loadacc a
storeacc 0x80
loadacc b
storeacc 0x81
loadacc c
storeacc 0x82

sub 0x80
loadacc #9
js
loadacc 0x82
storeacc 0x83
jump #6
loadacc 0x80
storeacc 0x83

sub 0x81
loadacc #3
js
nop
loadacc 0x81
storeacc 0x83
nop





















