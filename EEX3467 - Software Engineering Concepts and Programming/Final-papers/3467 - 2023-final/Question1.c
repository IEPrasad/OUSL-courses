#include <stdio.h>

int main() {

  int num_of_docs, rate_p_h, d_ID, h_w_p_w, salary;
  printf("Enter number of doctor: ");
  scanf("%d", &num_of_docs);

  printf("\nEnter rate per hour: ");
  scanf("%d", &rate_p_h);

  printf("Enter doctor ID: ");
  scanf("%d", &d_ID);

  printf("Enter hours worked per week: ");
  scanf("%d", &h_w_p_w);
  
  int calPay() {
    if (num_of_docs > 0 && rate_p_h > 0 && d_ID >= 0 && h_w_p_w >= 0) {
      if (h_w_p_w <= 28) {
        salary = rate_p_h * h_w_p_w;
      } else if (h_w_p_w > 28) {
        salary = (rate_p_h * 28) + (h_w_p_w - 28) * 2 * rate_p_h;
      }
    } else {
      printf("Error!, Please Enter positive values.");
    }
    return salary;
  }
  printf("Net salary of %d is %d", d_ID, salary);

  return 0;
}


// -------------

#include <stdio.h>

// Function prototype
int calPay(int rate_p_h, int h_w_p_w);

int main() {

    int num_of_docs, rate_p_h, d_ID, h_w_p_w, salary;
    
    printf("Enter number of doctors: ");
    scanf("%d", &num_of_docs);

    if (num_of_docs <= 0) {
        printf("Error: Number of doctors must be a positive number.\n");
        return 1;
    }

    for (int i = 0; i < num_of_docs; i++) {
        printf("\nEnter rate per hour: ");
        scanf("%d", &rate_p_h);

        printf("Enter doctor ID: ");
        scanf("%d", &d_ID);

        printf("Enter hours worked per week: ");
        scanf("%d", &h_w_p_w);

        if (rate_p_h <= 0 || d_ID < 0 || h_w_p_w < 0) {
            printf("Error: All inputs must be positive numbers.\n");
            continue;
        }

        // Call the calPay function and store the result in salary
        salary = calPay(rate_p_h, h_w_p_w);
        
        // Print the result
        printf("Net salary of Doctor ID %d is %d\n", d_ID, salary);
    }

    return 0;
}

// Function definition
int calPay(int rate_p_h, int h_w_p_w) {
    int salary;
    
    if (h_w_p_w <= 28) {
        salary = rate_p_h * h_w_p_w;
    } else {
        salary = (rate_p_h * 28) + (h_w_p_w - 28) * 2 * rate_p_h;
    }

    return salary;
}


// this is another way to do this problem 
// rememeber my above code is not fully correct !


