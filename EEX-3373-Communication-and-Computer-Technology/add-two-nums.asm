section .data
    num1    dd 10        ; First number (change value as needed)
    num2    dd 20        ; Second number (change value as needed)
    sum     dd 0         ; Variable to store the sum

section .text
    global _start       ; Entry point for the program

_start:
    ; Load num1 into a register
    mov eax, [num1]

    ; Add num2 to the register
    add eax, [num2]

    ; Store the result in the sum variable
    mov [sum], eax

    ; Display the sum
    ; You would need to implement the display function according to your platform
    ; For example, if you're working with Linux, you could use system calls to print the sum
    ; Here's a basic example:
    ; mov eax, 4          ; System call number for sys_write
    ; mov ebx, 1          ; File descriptor for stdout
    ; mov ecx, [sum]      ; Address of the sum variable
    ; mov edx, 10         ; Length of the string to print
    ; int 0x80            ; Call the kernel

    ; Exit the program
    ; You would need to implement the exit function according to your platform
    ; For example, if you're working with Linux, you could use the exit system call
    ; Here's a basic example:
    ; mov eax, 1          ; System call number for sys_exit
    ; xor ebx, ebx        ; Exit status (0 for success)
    ; int 0x80            ; Call the kernel
