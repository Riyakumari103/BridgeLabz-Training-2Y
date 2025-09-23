public class ProductDemo {
    static class Product {
        static double discount = 10; // 10% discount

        final int productID;
        String productName;
        double price;
        int quantity;

        Product(int productID, String productName, double price, int quantity) {
            this.productID = productID;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        void displayDetails() {
            if (this instanceof Product) {
                double discountedPrice = price - (price * discount / 100);
                System.out.println("Product ID: " + productID + ", Name: " + productName + ", Price: $" + discountedPrice + ", Quantity: " + quantity);
            }
        }

        static void updateDiscount(double newDiscount) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product p2 = new Product(102, "Phone", 20000, 5);

        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15);

        p1.displayDetails();
        p2.displayDetails();
    }
}
