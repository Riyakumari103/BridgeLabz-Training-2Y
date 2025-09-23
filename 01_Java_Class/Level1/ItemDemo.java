package Level1;
public class ItemDemo {
    static class Item {
        String itemCode;
        String itemName;
        double price;

        Item(String itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        void displayDetails(int quantity) {
            double totalCost = price * quantity;
            System.out.println("Item Code: " + itemCode + ", Name: " + itemName + ", Price: $" + price + ", Quantity: " + quantity + ", Total Cost: $" + totalCost);
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item("IT101", "Laptop", 50000);
        Item item2 = new Item("IT102", "Mouse", 500);

        item1.displayDetails(2);
        item2.displayDetails(5);
    }
}
