// ---------- Question 2 - vvvvvvv ----------------

#include <stdio.h>
#include <string.h>

void reverseString(char *input);
int countVowels(char *input);
int countDigits(char *input);
int checkInput(char *input);

int main() {
    char input[100];
    int numOfVowel = 0, numOfDigit = 0;

    printf("Enter a string: ");
    fgets(input, sizeof(input), stdin);
    
    if (input[strlen(input) - 1] == '\n')
        input[strlen(input) - 1] = '\0';

    if (!checkInput(input)) {
        printf("Error: Input string must contain with alphebet.\n");
        return 1;
    }

    reverseString(input);
    numOfVowel = countVowels(input);
    numOfDigit = countDigits(input);

    printf("Reversed string: %s\n", input);
    printf("Number of vowels: %d\n", numOfVowel);
    printf("Number of digits: %d\n", numOfDigit);

    return 0;
}

void reverseString(char *input) {
    int length = strlen(input);
    char temp;
    for (int i = 0; i < length / 2; i++) {
        temp = input[i];
        input[i] = input[length - i - 1];
        input[length - i - 1] = temp;
    }
}

int countVowels(char *input) {
    int count = 0;
    for (int i = 0; input[i] != '\0'; i++) {
        char value = input[i];
        if (value == 'a' || value == 'A' || value == 'e' || value == 'E' || value == 'i' || value == 'I' || value == 'o' || value == 'O' || value == 'u' || value == 'U')
            count++;
    }
    return count;
}

int countDigits(char *input) {
    int count = 0;
    for (int i = 0; input[i] != '\0'; i++) {
        char value = input[i];
        if (value >= '0' && value <= '9')
            count++;
    }
    return count;
}

int checkInput(char *input) {
    for (int i = 0; input[i] != '\0'; i++) {
        char value = input[i];
        if (!((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z') || (value >= '0' && value <= '9')))
            return 0;
    }
    return 1; 
}
