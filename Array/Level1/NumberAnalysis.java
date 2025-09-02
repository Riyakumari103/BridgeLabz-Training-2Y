import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        int[] numbers = new int[5];  
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\n--- Number Analysis ---");
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\n--- Comparison of First and Last Element ---");
        if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else if (first < last) {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ").");
        }

        scanner.close();
    }
}
