package Level2;
import java.util.Scanner;

public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a valid number (positive and less than 100).");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 1;
            while (number * counter < 100) {
                System.out.println(number * counter);
                counter++;
            }
        }

        scanner.close();
    }
}
