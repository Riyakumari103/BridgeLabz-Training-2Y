package Methods.Level3;
import java.util.*;

public class StudentScores {
    static Scanner sc = new Scanner(System.in);

    // Generate random marks for Physics, Chemistry, Maths
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(41) + 60; // random marks between 60-100
            }
        }
        return marks;
    }

    // Calculate total, average, percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    // Display the scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("\n----------------------------------------------");
        System.out.println("ID\tPhysics\tChem\tMaths\tTotal\tAvg\t%\tGrade");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            String grade;
            double percent = results[i][2];
            if (percent >= 80) grade = "A";
            else if (percent >= 70) grade = "B";
            else if (percent >= 60) grade = "C";
            else if (percent >= 50) grade = "D";
            else if (percent >= 40) grade = "E";
            else grade = "F";

            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] +
                    "\t" + (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grade);
        }
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }
}
