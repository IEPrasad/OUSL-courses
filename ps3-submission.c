#include <stdio.h>

int addition(int num1, int num2);
int multiplication(int num1, int num2);
void mySwap(int *a, int *b);


int main() {
  int num1 = 4;
  int num2 = 5;

  int sum = addition(num1, num2);
  int product = multiplication(num1, num2);

  printf("The sum of %d and %d is = %d", num1, num2,sum);
  printf("\nThe multiplication of %d and %d is = %d", num1, num2, product);

  printf("\n\n");


  mySwap(&sum, &product);
  printf("Sum is %d and product is %d", sum, product);
  return 0;
}

int addition(int num1, int num2) {
  return num1 + num2;
}

int multiplication(int num1, int num2) {
  return num1 * num2;
}

void mySwap(int *a, int *b) {

  int var = *a;
  *a = *b;
  *b = var;
}















