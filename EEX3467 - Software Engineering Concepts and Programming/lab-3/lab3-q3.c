//------------------------ Question 3  vvvvv------------------------------------


#include <stdio.h>

void printReverse(int myArray[], int length);
float calculateAverage(int myArray[], int length);

int main() {
    int myArray[10], i;

    printf("Enter 10 integer values:\n");
    for (i = 0; i < 10; i++) {
        scanf("%d", &myArray[i]);
    }

    printf("Values in reverse order: ");
    printReverse(myArray, 10);
    printf("\nAverage value of the 10 integer values: %.1f\n", calculateAverage(myArray, 10));

    return 0;
}

void printReverse(int myArray[], int length) {
    int i;
    for (i = length - 1; i >= 0; i--) {
        printf("%d ", myArray[i]);
    }
}

float calculateAverage(int myArray[], int length) {
    int i, sum = 0;
    float average;
    for (i = 0; i < length; i++) {
        sum += myArray[i];
    }
    average = (float)sum / length;
    return average;
}

