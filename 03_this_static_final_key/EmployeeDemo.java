public class EmployeeDemo {
    static class Employee {
        static String companyName = "Tech Solutions";
        private static int totalEmployees = 0;

        final int id;
        String name;
        String designation;

        Employee(String name, int id, String designation) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            totalEmployees++;
        }

        void displayDetails() {
            if (this instanceof Employee) {
                System.out.println("Company: " + companyName + ", Name: " + name + ", ID: " + id + ", Designation: " + designation);
            }
        }

        static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Deepti", 1, "Developer");
        Employee e2 = new Employee("Ravi", 2, "Tester");

        e1.displayDetails();
        e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
