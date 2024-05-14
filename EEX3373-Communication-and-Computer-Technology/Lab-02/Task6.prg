Lab Task 6:

Draw a flowchart to demonstrate the process of comparing two values. Write an Assembly language
program for the above algorithm.
(demonstrate how to use conditional branch operations)

● You have to use last two digits from your s number (if it is zero you can consider value as 9)
● After comparing two digits if the result is negative store the value 1 in 0x83 memory location.
● After comparing two digits if the result is positive store the value 7 in 0x81 memory location.


loadacc #5
storeacc 0x80
loadacc #7
sub 0x80
loadacc #9
js
loadacc #7
storeacc 0x81
nop
laddacc #1
storeacc 0x83
nop


// this should be the code 
(Do this so that both positive and negative cases are obtained)
