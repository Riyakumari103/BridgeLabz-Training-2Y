package Methods.Level3;

import java.util.Scanner;

public class NumberUtility {
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
    public static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        number = Math.abs(number);
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;  
        return (number % sum == 0);
    }
    public static int[][] digitFrequency(int[] digits) {
        int[][] freqArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freqArray[i][0] = i;  
            freqArray[i][1] = 0; 
        }

        for (int digit : digits) {
            freqArray[digit][1]++;
        }

        return freqArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));

        System.out.print("Digits are: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));

        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));

        if (isHarshad(number, digits)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is NOT a Harshad number.");
        }

        System.out.println("Frequency of digits:");
        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " time(s)");
            }
        }

        sc.close();
    }
}

