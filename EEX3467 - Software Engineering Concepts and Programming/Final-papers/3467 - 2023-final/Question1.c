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

