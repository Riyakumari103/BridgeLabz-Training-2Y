package Methods.Level3;

import java.util.Scanner;

public class NumberChecker5{

    // Method 1: Sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method 2: Check perfect number
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    // Method 3: Check abundant number
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    // Method 4: Check deficient number
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    // Method 5: Factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method 6: Check strong number
    public static boolean isStrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Perfect number? " + isPerfect(number));
        System.out.println("Is Abundant number? " + isAbundant(number));
        System.out.println("Is Deficient number? " + isDeficient(number));
        System.out.println("Is Strong number? " + isStrong(number));

        sc.close();
    }
}
