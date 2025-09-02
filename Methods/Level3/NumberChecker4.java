package Methods.Level3;

import java.util.Scanner;

public class NumberChecker4{

    // Method 1: Check prime number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method 2: Check neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Method 3: Check spy number
    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method 4: Check automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method 5: Check buzz number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime number? " + isPrime(number));
        System.out.println("Is Neon number? " + isNeon(number));
        System.out.println("Is Spy number? " + isSpy(number));
        System.out.println("Is Automorphic number? " + isAutomorphic(number));
        System.out.println("Is Buzz number? " + isBuzz(number));

        sc.close();
    }
}
