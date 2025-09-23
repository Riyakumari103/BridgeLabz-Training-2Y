package Level2;

public class StudentDemo {
    static class Student {
        String name;
        int rollNumber;
        double marks;

        Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        String calculateGrade() {
            if (marks >= 90) return "A+";
            else if (marks >= 80) return "A";
            else if (marks >= 70) return "B";
            else if (marks >= 60) return "C";
            else return "F";
        }

        void displayDetails() {
            System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks + ", Grade: " + calculateGrade());
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Riya", 101, 95);
        Student s2 = new Student("Ravi", 102, 78);

        s1.displayDetails();
        s2.displayDetails();
    }
}