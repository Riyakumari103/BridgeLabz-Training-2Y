package Level2;

import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int EMPLOYEES = 10;

        double[] salaries = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonuses = new double[EMPLOYEES];
        double[] newSalaries = new double[EMPLOYEES];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Salary: ");
                double salaryInput = scanner.nextDouble();
                if (salaryInput > 0) {
                    salaries[i] = salaryInput;
                    break;
                } else {
                    System.out.println("Invalid salary. Please enter a positive number.");
                }
            }
            while (true) {
                System.out.print("Years of service: ");
                double yearsInput = scanner.nextDouble();
                if (yearsInput >= 0) {
                    yearsOfService[i] = yearsInput;
                    break;
                } else {
                    System.out.println("Invalid years of service. Please enter zero or a positive number.");
                }
            }
        }
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; 
            } else {
                bonuses[i] = salaries[i] * 0.02; 
            }
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nEmployee-wise Salary and Bonus details:");
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f\n", 
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal bonus payout by Zara: %.2f\n", totalBonus);
        System.out.printf("Total old salary of all employees: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary of all employees: %.2f\n", totalNewSalary);

        scanner.close();
    }
}

