import java.time.LocalDate;
class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String msg) { super(msg); }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String msg) { super(msg); }
}
class Vehicle {
    private LocalDate serviceDate;
    private int mileage;

    public Vehicle(LocalDate serviceDate, int mileage) {
        this.serviceDate = serviceDate;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage: Mileage cannot be negative!");
        }

        if (serviceDate.isBefore(LocalDate.now())) {
            throw new ServiceOverdueException("Service overdue! Please schedule maintenance.");
        }

        System.out.println("Vehicle maintenance status is OK.");
    }
}
public class MaintenanceApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(LocalDate.of(2023, 10, 1), 15000);

        try {
            vehicle.checkMaintenance();
        } catch (InvalidMileageException e) {
            System.out.println("Mileage Error: " + e.getMessage());
        } catch (ServiceOverdueException e) {
            System.out.println("Service Alert: " + e.getMessage());
        }
    }
}
