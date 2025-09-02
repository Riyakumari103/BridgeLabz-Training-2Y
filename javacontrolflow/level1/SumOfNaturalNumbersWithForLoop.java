package Level1;

import java.util.Scanner;

public class SumOfNaturalNumbersWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
       
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
           
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            
            if (sumLoop == sumFormula) {
                System.out.println(" Both results match. Computation is correct.");
            } else {
                System.out.println(" Results do not match. There might be an error.");
            }
        }

        scanner.close();
    }
}
