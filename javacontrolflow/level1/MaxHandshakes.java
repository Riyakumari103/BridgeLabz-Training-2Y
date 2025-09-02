import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        input.close();
    }
}
