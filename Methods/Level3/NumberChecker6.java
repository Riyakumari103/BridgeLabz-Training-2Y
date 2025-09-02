package Methods.Level3;

import java.util.Scanner;

public class NumberChecker6{

    // Method 1: Find factors and return as an array
    public static int[] getFactors(int num) {
        // First count number of factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        // Store factors in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method 2: Find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method 3: Find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method 4: Find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method 5: Product of cubes of factors
    public static long productOfCubes(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));

        sc.close();
    }
}
