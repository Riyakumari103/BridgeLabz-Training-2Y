package Level1;
public class MobilePhoneDemo {
    static class MobilePhone {
        String brand;
        String model;
        double price;

        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void displayDetails() {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
        }
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 120000);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 90000);

        phone1.displayDetails();
        phone2.displayDetails();
    }
}