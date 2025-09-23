public class StudentDemo {
    static class Student {
        static String universityName = "Global University";
        private static int totalStudents = 0;

        final int rollNumber;
        String name;
        String grade;

        Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
            totalStudents++;
        }

        void displayDetails() {
            if (this instanceof Student) {
                System.out.println("University: " + universityName + ", Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
            }
        }

        static void displayTotalStudents() {
            System.out.println("Total Students: " + totalStudents);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Deepti", 101, "A");
        Student s2 = new Student("Ravi", 102, "B");

        s1.displayDetails();
        s2.displayDetails();

        Student.displayTotalStudents();
    }
}
