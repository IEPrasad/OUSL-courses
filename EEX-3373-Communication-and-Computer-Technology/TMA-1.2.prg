III. Consider an array of x number of elements, 8-bit binary numbers Arr[x]. The array numbers start
from Arr[0], and end from Arr[x-1].
 Initialize the Arr[x] with a set of integers.(You can assign x , 11>x>5).
 Assume that the array Arr[ x] data are start to store from the memory address 7516 (0x75).
 Loop through each element in the Arr[x] to get the Sum and store it in the 0x87 memory
location. Calculate the average, avg_Arr[x] of the Arr[x] and store it in the 0x88 memory
location.
 If L- avg_Arr[] = 0 load accumulator with value L (L =First digit of your S-number) and store it
in 0x90 memory location.
 If L< avg_Arr[] load accumulator with value M (M =Second digit of your S-number) and store
it in 0x91 memory location.
 If L> avg_Arr[] load accumulator with value N (N=Third digit of your S-number) and store it in
0x92 memory location.


write a ALP for this task ! 
(it's literally hard, but try to do this however !)


loadacc #6 // acc = 6
storeacc 0x75 // 
inc // acc = 7
storeacc 0x76
inc // acc = 8
storeacc 0x77
inc // acc = 9
storeacc 0x78 
inc // acc = 10
storeacc 0x79

add 0x75 // acc = 10 + 6 = 16
add 0x76 // acc = 16 + 7 = 23
add 0x77 // acc = 23 + 8 = 31
add 0x78 // acc = 31 + 9 = 40

storeacc 0x87 
div #5
storeacc 0x88

loadacc #2
sub 0x88

loadacc #24
jz
loadacc #9
js
loaddacc #0 // third digit store if L > avg (+)
storeacc 0x92
nop

loadacc #3
storeacc 0x91 // second digit store if L < avg (-)
nop

loadacc #2 // first digit store if L = avg (0)
storeacc 0x90
nop


as I understand this is the code 
but I'm not sure, because there is another code called looz, this operand use for the loops 
so I think if we can use this looz keyword, we can make this code more easier ....!
