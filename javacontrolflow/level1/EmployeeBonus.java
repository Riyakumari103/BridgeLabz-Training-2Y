package Level1;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
       
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0.0;
       
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
    
        System.out.printf("Bonus amount: %.2f%n", bonus);

        scanner.close();
    }
}

