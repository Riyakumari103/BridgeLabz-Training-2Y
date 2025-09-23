package  Level1;
public class EmployeeDemo {
    static class Employee {
        String name;
        int id;
        double salary;

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Employee Name: " + name + ", ID: " + id + ", Salary: $" + salary);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Riya", 101, 50000);
        Employee emp2 = new Employee("Ravi", 102, 45000);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
