#include <stdio.h>

int calPay(float rate_per_hour,int hwpw);

int main() {

  int nu_of_doctors, doc_id, hwpw;
  float rate_per_hour, salary;

  printf("Enter number of doctors: ");
  scanf("%d", &nu_of_doctors);

  if (nu_of_doctors <= 0) {
    printf("Error: Number of doctors must be a positive numbers.\n");
    return 1;
  }

  for (int i = 1; i <= nu_of_doctors; i++) {
    printf("\nEnter rate per hour: ");
    scanf("%f", &rate_per_hour);

    printf("\nEnter doctor ID: ");
    scanf("%d", &doc_id);

    printf("Enter hours worked per week: ");
    scanf("%d", &hwpw);

    if (rate_per_hour <= 0 || doc_id < 0 || hwpw < 0) {
      printf("Error: All inputs must be positive number.");
      continue;
    }

    // Call the calpay function and store the value the result in salary.
    salary = calPay(rate_per_hour, hwpw);
  
    printf("Net salary of Doctor ID %d is %f\n", doc_id, salary);
  }
  return 0;
}

// Function definition
int calPay(float rate_per_hour, int hwpw) {
  float salary;

  if (hwpw <= 28) {
    salary = hwpw * rate_per_hour;
  } else if (hwpw > 28) {
    salary = 28 * rate_per_hour + (hwpw - 28) * 2*rate_per_hour;
  }

  return salary;
}


