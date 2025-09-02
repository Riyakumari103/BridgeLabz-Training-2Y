package Level2;
import java.util.Scanner;

public class BMIMultiDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter weight (in kg, positive): ");
                double weight = scanner.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                } else {
                    System.out.println("Invalid input. Weight must be positive.");
                }
            }
            while (true) {
                System.out.print("Enter height (in meters, positive): ");
                double height = scanner.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                } else {
                    System.out.println("Invalid input. Height must be positive.");
                }
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
