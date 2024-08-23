#include <stdio.h>

int main() {
  const MINIMUM = 1;
  const MAXIMUM = 100;
  int index = 0;
  int total_valid = 0;
  int sum = 0;
  int count = length(Numbers);
  float average;

  while (index < count) {
    if (MINIMUM <= Numbers[index] <= MAXIMUM) {
      total_valid += 1;
      sum += 1;
    } else {
      index += 1;
    }
  }

  if (total_valid > 0) {
    average = sum / total_valid;
    printf("Total sum of valid numbers is: %d", sum);
    printf("Average of valid number is: %f", average);
  } else {
    printf("No valid inputs.");
  }

  return 0;
}
