package Methods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3{

    // Method 1: Find count of digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method 2: Store digits of number in an array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Method 3: Reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method 4: Compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method 5: Check palindrome number
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method 6: Check Duck number
    public static boolean isDuckNumber(int[] digits) {
        // Duck number → must have at least one zero, 
        // but cannot start with zero
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Digits array
        int[] digits = getDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Reverse array
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));

        // Compare arrays
        System.out.println("Digits and reversed arrays equal? " + compareArrays(digits, reversed));

        // Palindrome check
        System.out.println("Is Palindrome number? " + isPalindrome(digits));

        // Duck number check
        System.out.println("Is Duck number? " + isDuckNumber(digits));

        sc.close();
    }
}
