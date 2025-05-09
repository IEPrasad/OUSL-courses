// -------------- Question 1 --- vvvvvvvvv --------------------

#include <stdio.h>

int calculateShippingCost(int number);

int main() {
  int number;
  float cost;

  printf("Enter the weight of the package (in kilograms) or enter -1 to stop: ");
  scanf("%d", &number);

  if (number > 0 && number <= 5) {
    cost = calculateShippingCost(number);
  } else if (number > 5) {
    cost = calculateShippingCost(number);
  } else if (number == -1) {
    return 0;
  } else if (number < 0) {
    printf("Error: Weight must be a positive number. Please enter a valid weight.");
    return 1;
  }

  printf("Shipping cost for package with weight %dkg: $%.2f\n", number, cost);
  return 0;
}

int calculateShippingCost(int number) {
  float cost;
  if (number <= 5) {
    cost = number * 10;
  } else {
    cost = number * 8;
  }
  return cost;
}
