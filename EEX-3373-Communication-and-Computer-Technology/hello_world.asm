section .data
    hello db 'Hello, World!', 10 ; 10 is the newline character
    hello_len equ $ - hello ; Length of the string

section .text
    global _start

_start:
    ; Write the string to stdout
    mov eax, 4           ; sys_write system call
    mov ebx, 1           ; file descriptor 1 (stdout)
    mov ecx, hello       ; pointer to the string
    mov edx, hello_len   ; length of the string
    int 0x80             ; make kernel call

    ; Exit the program
    mov eax, 1           ; sys_exit system call
    xor ebx, ebx         ; exit status 0
    int 0x80             ; make kernel call
