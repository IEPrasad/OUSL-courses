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
