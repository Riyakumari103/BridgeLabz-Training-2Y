public class VehicleDemo {
    static class Vehicle {
        static double registrationFee = 500;

        final String registrationNumber;
        String ownerName;
        String vehicleType;

        Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            this.registrationNumber = registrationNumber;
        }

        void displayDetails() {
            if (this instanceof Vehicle) {
                System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration No: " + registrationNumber + ", Fee: $" + registrationFee);
            }
        }

        static void updateRegistrationFee(double fee) {
            registrationFee = fee;
            System.out.println("Registration fee updated to $" + fee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Deepti", "Car", "REG101");
        Vehicle v2 = new Vehicle("Ravi", "Bike", "REG102");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(600);

        v1.displayDetails();
        v2.displayDetails();
    }
}