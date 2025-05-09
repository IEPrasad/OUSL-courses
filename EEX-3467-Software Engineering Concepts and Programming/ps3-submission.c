#include <stdio.h>

int addition(int num1, int num2);
int multiplication(int num1, int num2);
int mySwap(int num1, int num2);


int main() {
  int num1 = 4;
  int num2 = 5;

  int sum = addition(num1, num2);
  int product = multiplication(num1, num2);

  printf("The sum of %d and %d is = %d", num1, num2,sum);
  printf("\nThe multiplication of %d and %d is = %d", num1, num2, product);

  printf("\n\n");


  mySwap(num1, num2);
  return 0;
}

int addition(int num1, int num2) {
  return num1 + num2;
}

int multiplication(int num1, int num2) {
  return num1 * num2;
}

int mySwap(int num1, int num2) {

  int temp_num1_value = num1;
  int *pt_num1 = &num1; 
  int *pt_num2 = &num2;

  num1 = *pt_num2;
  num2 = temp_num1_value;


  int sum = num1 + num2;
  int product = num1 * num2;

  printf("After swapping the numbers,\n");

  printf("\nThe sum of %d and %d is = %d", num1, num2, sum);
  printf("\nThe multiplication of %d and %d is = %d",num1, num2, product);
}















