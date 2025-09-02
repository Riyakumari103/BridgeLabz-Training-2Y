package Methods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        number = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("Original digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reversed));
        System.out.println("Number of digits: " + countDigits(number));

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is NOT a Palindrome number.");
        }
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is NOT a Duck number.");
        }

        scanner.close();
    }
}
