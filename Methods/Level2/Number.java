package Methods.Level2;

import java.util.Scanner;

public class Number {
    public static boolean isPositive(int number) {
        return number > 0;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number at index " + i + " is " + num + ": ");

            if (isPositive(num)) {
                System.out.print("Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
        System.out.println("\n--- First and Last Element Comparison ---");
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First element (" + numbers[0] + ") is greater than last element (" + numbers[4] + ")");
        } else if (result == 0) {
            System.out.println("First element and last element are equal (" + numbers[0] + ")");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than last element (" + numbers[4] + ")");
        }

        scanner.close();
    }
}

