// #include <stdio.h>

// int main() {
//   const MINIMUM = 1;
//   const MAXIMUM = 100;
//   int index = 0;
//   int total_valid = 0;
//   int sum = 0;
//   int count = length(Numbers);
//   float average;

//   printf("Enter index between 1 to 100: ");
//   scanf("%d", index);
//   if (1 <= index <= 100) {
  
//     while (index < count) {
//       if (MINIMUM <= Numbers[index] <= MAXIMUM) {
//         total_valid += 1;
//         sum += 1;
//       } else {
//         index += 1;
//       }
//     }
  
//     if (total_valid > 0) {
//       average = sum / total_valid;
//       printf("Total sum of valid numbers is: %d", sum);
//       printf("Average of valid number is: %f", average);
//     } else {
//       printf("No valid inputs.");
//     }
//   } else {
//     printf("Input Error!, Enter index numebr between 1 to 100!");
//   }
//   return 0;
// }





// #include <stdio.h>

// int main() {
//     const int MINIMUM = 1;
//     const int MAXIMUM = 100;
//     int index = 0;
//     int total_valid = 0;
//     int sum = 0;
//     int count;
//     float average;
//     int Numbers[] = {5, 10, 20, 15, 50, 75, 30};  // Example array
//     count = sizeof(Numbers) / sizeof(Numbers[0]); // Calculate the size of the array

//     printf("Enter index between 1 to 100: ");
//     scanf("%d", &index);  // Pass address of index to scanf
//     if (index >= 1 && index <= 100) {
        
//         while (index < count) {
//             if (Numbers[index] >= MINIMUM && Numbers[index] <= MAXIMUM) {
//                 total_valid += 1;
//                 sum += Numbers[index];  // Add the actual value to the sum
//             }
//             index += 1;
//         }
        
//         if (total_valid > 0) {
//             average = (float)sum / total_valid;  // Cast sum to float for correct division
//             printf("Total sum of valid numbers is: %d\n", sum);
//             printf("Average of valid numbers is: %.2f\n", average);
//         } else {
//             printf("No valid inputs.\n");
//         }
//     } else {
//         printf("Input Error! Enter an index number between 1 to 100!\n");
//     }
//     return 0;
// }



// --------------------------------------------------------------------------------------------------------

#include <stdio.h>

#define MINIMUM 1 
#define MAXIMUM 100 

// Function prototypes
void getInput(int *index);
int isValidIndex(int index);
int calculateSumAndCount(const int Numbers[], int index, int count, int *total_valid);
void printResults(int total_valid, int sum);

int main() {
    int index = 0;
    int total_valid = 0;
    int sum = 0;
    float average;
    int Numbers[] = {5, 10, 20, 15, 50, 75, 30};  // Example array
    int count = sizeof(Numbers) / sizeof(Numbers[0]); // Calculate the size of the array

    getInput(&index);
    
    if (isValidIndex(index)) {
        sum = calculateSumAndCount(Numbers, index, count, &total_valid);
        printResults(total_valid, sum);
    } else {
        printf("Input Error! Enter an index number between 1 to 100!\n");
    }

    return 0;
}

// Function to get user input
void getInput(int *index) {
    printf("Enter index between 1 to 100: ");
    scanf("%d", index);
}

// Function to check if the index is valid
int isValidIndex(int index) {
    return (index >= 1 && index <= 100);
}

// Function to calculate the sum of valid numbers and count them
int calculateSumAndCount(const int Numbers[], int index, int count, int *total_valid) {
    int sum = 0;
    while (index < count) {
        if (Numbers[index] >= MINIMUM && Numbers[index] <= MAXIMUM) {
            (*total_valid)++;
            sum += Numbers[index];
        }
        index++;
    }
    return sum;
}

// Function to print the results
void printResults(int total_valid, int sum) {
    if (total_valid > 0) {
        float average = (float)sum / total_valid;
        printf("Total sum of valid numbers is: %d\n", sum);
        printf("Average of valid numbers is: %.2f\n", average);
    } else {
        printf("No valid inputs.\n");
    }
}

// --- this code show how to solve this task using function -----

// 1st point of this code 
// The * is used with index in getInput(int *index) because we need to 
// modify the original index variable in the main function. By passing a pointer 
// (int *index), the function can directly update the value of index.









