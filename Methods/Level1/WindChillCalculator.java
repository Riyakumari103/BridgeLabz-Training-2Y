package Methods.Level1;

import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temp, double windSpeed) {
        double windSpeedPower = Math.pow(windSpeed, 0.16);

        double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeedPower;
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();

        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative.");
        } else {
            double windChill = calculateWindChill(temp, windSpeed);
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }

        scanner.close();
    }
}

