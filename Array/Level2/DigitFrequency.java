package Level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        number = Math.abs(number);
        int[] digits = new int[20]; 
        int index = 0;

        long temp = number;
        if (temp == 0) {
            digits[index++] = 0; 
        }
        while (temp > 0) {
            digits[index++] = (int)(temp % 10);
            temp /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " : " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
