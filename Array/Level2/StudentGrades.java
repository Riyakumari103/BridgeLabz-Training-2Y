package Level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[][] marks = new int[numberOfStudents][3]; 
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else subject = "Maths";

                while (true) {
                    System.out.print("Enter marks for " + subject + " (0-100): ");
                    int mark = scanner.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                    }
                }
            }
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;
            double p = percentages[i];
            if (p >= 90) {
                grades[i] = 'A';
            } else if (p >= 80) {
                grades[i] = 'B';
            } else if (p >= 70) {
                grades[i] = 'C';
            } else if (p >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        System.out.println("\n--- Student Marks, Percentage, and Grades ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-6s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-6c\n",
                marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
