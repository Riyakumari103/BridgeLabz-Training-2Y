
import java.util.Scanner;

public class TemperatureConverter {
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char ch = sc.next().toUpperCase().charAt(0);

        if (ch == 'C') {
            System.out.println("Celsius: " + toCelsius(temp));
        } else if (ch == 'F') {
            System.out.println("Fahrenheit: " + toFahrenheit(temp));
        } else {
            System.out.println("Invalid option.");
        }
        sc.close();
    }
}
