package Methods.Level2;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }

        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Sum calculated using recursion: " + sumRecursive);
        System.out.println("Sum calculated using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both methods produce the same result. The calculation is correct.");
        } else {
            System.out.println("The results differ! There might be an error in the computation.");
        }

        scanner.close();
    }
}

