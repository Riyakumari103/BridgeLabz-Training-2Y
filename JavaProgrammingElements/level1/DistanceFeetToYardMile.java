import java.util.Scanner;

public class DistanceFeetToYardMile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(\"Enter distance in feet: \");
        double feet = scanner.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.printf(\"The distance in yards is %.2f while the distance in miles is %.5f%n\", yards, miles);

        scanner.close();
    }
}
