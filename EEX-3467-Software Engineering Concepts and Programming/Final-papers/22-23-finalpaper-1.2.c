#include <stdio.h>
  
int calPay(hours_worked_per_week, rate_per_hour) {
  if (hours_worked_per_week > 28) {
    payment = (hours_worked_per_week - 28) * 2 * rate_per_hour + (28 * rate_per_hour);
  } else {
    payment = hours_worked_per_week * rate_per_hour
  }

  return `Payement: `,payment;
}

int main() {
  int num_of_docs, rate_per_hour, doctor_ID, hours_worked_per_week;
  
    

  return 0;
}
 



// There is an important point, we can't use single quotes inside the printf function
// We should use double quotes  

// The user has to input the number of doctors, rate per hour, doctor ID, hours worked per
// week to compute the gross pay of a doctor.

// Pay should be at the normal rate for up to 28 hours per week and double the hourly rate
// for all hours worked beyond 28 hours.
// Design a function called calPay() to calculate the payment and returns the value.
// Inputs should be positive numbers, otherwise the program should display an error
// message.
// After weekly pay is calculated, the Doctor ID and the amount need to be paid should be
// written to a Text file.

