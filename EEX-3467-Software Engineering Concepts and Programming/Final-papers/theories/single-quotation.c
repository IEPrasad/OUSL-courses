A character constant in C is a single character enclosed in single quotes (`'`).
  It represents an integer value corresponding to the character's ASCII value.

with printf we can't use like this 
  printf('Enter value: ') // this is wrong 
we can use this correctly like this 
  printf("Enter value: ") // this is correct 

if we need to use single quotation in c programming 
we can only use like this 


sample code 

#include <stdio.h>

int main() {
    char ch = 'A';  // 'A' is a character constant
    int ascii_value = 'A';  // Character constant 'A' has an ASCII value of 65

    printf("Character: %c\n", ch);          // Output: Character: A
    printf("ASCII Value: %d\n", ascii_value);  // Output: ASCII Value: 65

    return 0;
}

/*
The output of this code:
>>>
Character: A
ASCII Value: 65
*/


In this example:

    char ch = 'A'; initializes a character variable ch with the character constant 'A'.
    int ascii_value = 'A'; initializes an integer variable ascii_value with the ASCII value of the character constant `'A'` (which is 65).
    The printf statements display the character and its ASCII value.
