# Write an assembly program to compare two values 
# Select last two digits from your s number 
# when compare two values if the result is negative 
  # store value 7 in 0x80
# if result is positive, then store value 5 in 0x81

loadacc #5
storeacc 0x85
loadacc #2
sub 0x85
loadacc #9
js
loadacc #5
store acc 0x81
nop
loadacc #7
storeacc 0x82
nop
