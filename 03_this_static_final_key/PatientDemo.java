public class PatientDemo {
    static class Patient {
        static String hospitalName = "City Hospital";
        private static int totalPatients = 0;

        final int patientID;
        String name;
        int age;
        String ailment;

        Patient(String name, int age, String ailment, int patientID) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            this.patientID = patientID;
            totalPatients++;
        }

        void displayDetails() {
            if (this instanceof Patient) {
                System.out.println("Hospital: " + hospitalName + ", Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
            }
        }

        static void getTotalPatients() {
            System.out.println("Total Patients: " + totalPatients);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Deepti", 25, "Fever", 101);
        Patient p2 = new Patient("Ravi", 30, "Flu", 102);

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}