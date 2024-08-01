#include <stdio.h>

#define NORMAL_HOURS 28
#define DOUBLE_RATE_HOURS 2.0

// Function prototype
double calPay(int rate_per_hour, int hours_worked);

int main() {
    int num_of_docs, rate_per_hour, doctor_ID, hours_worked_per_week;
    FILE *file;

    printf("Enter number of doctors: ");
    scanf("%d", &num_of_docs);

    if (num_of_docs <= 0) {
        printf("Error: Number of doctors must be a positive number.\n");
        return 1;
    }

    // Open file for writing
    file = fopen("doctor_pay.txt", "w");
    if (file == NULL) {
        printf("Error opening file!\n");
        return 1;
    }

    for (int i = 0; i < num_of_docs; i++) {
        printf("Enter Doctor ID: ");
        scanf("%d", &doctor_ID);

        printf("Enter rate per hour: ");
        scanf("%d", &rate_per_hour);

        printf("Enter hours worked per week: ");
        scanf("%d", &hours_worked_per_week);

        if (rate_per_hour <= 0 || hours_worked_per_week <= 0) {
            printf("Error: Rate per hour and hours worked must be positive numbers.\n");
            i--; // Re-run the current iteration for valid input
            continue;
        }

        double pay = calPay(rate_per_hour, hours_worked_per_week);

        printf("Doctor ID: %d, Pay: %.2f\n", doctor_ID, pay);

        // Write to file
        fprintf(file, "Doctor ID: %d, Pay: %.2f\n", doctor_ID, pay);
    }

    // Close the file
    fclose(file);

    return 0;
}

// Function definition
double calPay(int rate_per_hour, int hours_worked) {
    double pay;
    if (hours_worked <= NORMAL_HOURS) {
        pay = rate_per_hour * hours_worked;
    } else {
        pay = (rate_per_hour * NORMAL_HOURS) + (rate_per_hour * DOUBLE_RATE_HOURS * (hours_worked - NORMAL_HOURS));
    }
    return pay;
}
