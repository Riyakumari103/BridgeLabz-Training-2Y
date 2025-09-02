package Level2;
import java.util.Scanner;

public class LargestDigitsDynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();  
        if (number == 0) {
            System.out.println("Largest digit: 0");
            System.out.println("No second largest digit.");
            scanner.close();
            return;
        }
        if (number < 0) {
            number = Math.abs(number);
        }
        while (number != 0) {
            int lastDigit = (int) (number % 10);
            number /= 10;
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            digits[index] = lastDigit;
            index++;
        }
        int largest = -1;    
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);

        if (secondLargest == -1) {
            System.out.println("No second largest digit.");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        scanner.close();
    }
}

