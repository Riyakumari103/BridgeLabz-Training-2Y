package Level3;

import java.util.Scanner;

public class DayOfWeek {

    public static int calculateDayOfWeek(int m, int d, int y) {
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int q = d;
        int K = y % 100;
        int J = y / 100;

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        int dayOfWeek = (h + 6) % 7;

        return dayOfWeek;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1=Jan, ..., 12=Dec): ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int dow = calculateDayOfWeek(month, day, year);
        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + dow);
    }
}


