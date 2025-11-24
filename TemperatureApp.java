import java.util.Scanner;
class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String msg) {
        super(msg);
    }
}
class TemperatureConverter {

    public static double cToF(double celsius) throws InvalidTemperatureException {
        if (celsius < -273.15) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        }
        return (celsius * 9 / 5) + 32;
    }

    public static double fToC(double fahrenheit) throws InvalidTemperatureException {
        if (fahrenheit < -459.67) {
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        }
        return (fahrenheit - 32) * 5 / 9;
    }
}
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.print("Enter unit (C/F): ");
        String unit = sc.next().toUpperCase();

        try {
            if (unit.equals("C")) {
                double f = TemperatureConverter.cToF(value);
                System.out.printf("%.2f°C = %.2f°F%n", value, f);
            } else if (unit.equals("F")) {
                double c = TemperatureConverter.fToC(value);
                System.out.printf("%.2f°F = %.2f°C%n", value, c);
            } else {
                System.out.println("Invalid unit! Please enter 'C' or 'F'.");
            }
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

