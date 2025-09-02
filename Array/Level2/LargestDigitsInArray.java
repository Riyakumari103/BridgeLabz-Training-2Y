package Level2;

import java.util.Scanner;

public class LargestDigitsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number != 0) {
            int lastDigit = number % 10;
            digits[index] = lastDigit;
            index++;
            if (index == maxDigit) {
                break;
            }

            number /= 10;
        }
        if (index == 0) {
            System.out.println("No digits found.");
            return;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        if (secondLargest == 0 && largest == 0) {
            System.out.println("No second largest digit.");
        } else if (secondLargest == 0 && largest != 0) {
            boolean foundSecond = false;
            for (int i = 0; i < index; i++) {
                if (digits[i] != largest) {
                    foundSecond = true;
                    break;
                }
            }
            if (foundSecond) {
                System.out.println("Second largest digit: " + secondLargest);
            } else {
                System.out.println("No second largest digit.");
            }
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        scanner.close();
    }
}

