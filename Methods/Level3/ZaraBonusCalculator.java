package Methods.Level3;


import java.util.Random;

public class ZaraBonusCalculator {

    static final int EMPLOYEES = 10;

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(); 
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }
    public static double[][] generateEmployeeData() {
        double[][] data = new double[EMPLOYEES][2];
        Random rand = new Random();

        for (int i = 0; i < EMPLOYEES; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = rand.nextInt(11);             
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updatedData = new double[EMPLOYEES][2];
        for (int i = 0; i < EMPLOYEES; i++) {
            double salary = employeeData[i][0];
            int years = (int) employeeData[i][1];

            double bonusPercentage = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            updatedData[i][0] = bonus;
            updatedData[i][1] = newSalary;
        }

        return updatedData;
    }
    public static void displaySummary(double[][] originalData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-15s %-20s %-15s %-15s\n", 
                          "Emp ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEES; i++) {
            double oldSalary = originalData[i][0];
            int years = (int) originalData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-15.2f %-20d %-15.2f %-15.2f\n", 
                              (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-20s %-15.2f %-15.2f\n", 
                          "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}
