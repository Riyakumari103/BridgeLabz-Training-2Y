package Level2;

import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter a non-negative power (exponent): ");
        int power = scanner.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Please enter only positive integers.");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

        scanner.close();
    }
}

