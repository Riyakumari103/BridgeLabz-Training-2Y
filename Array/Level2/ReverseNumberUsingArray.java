package Level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }
        int temp = number;
        int count = 0;
        if (temp == 0) {
            count = 1; 
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }
        System.out.print("Reversed number is: "); 
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);  
        }
        System.out.println();

        scanner.close();
    }
}

