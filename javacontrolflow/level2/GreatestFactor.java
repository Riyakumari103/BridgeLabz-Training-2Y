package Level2;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            int greatestFactor = 1; 
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; 
                }
            }
            System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        }

        scanner.close();
    }
}
