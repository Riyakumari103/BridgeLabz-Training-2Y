package Methods.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100; 
            double bmi = weight / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;
        }
    }
    public static String[] getBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMBER_OF_PEOPLE = 10;
        double[][] personData = new double[NUMBER_OF_PEOPLE][3]; 
        for (int i = 0; i < NUMBER_OF_PEOPLE; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        calculateBMI(personData);
        String[] status = getBMIStatus(personData);
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < NUMBER_OF_PEOPLE; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                personData[i][0],
                personData[i][1],
                personData[i][2],
                status[i]
            );
        }

        scanner.close();
    }
}
