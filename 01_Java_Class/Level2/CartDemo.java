package Level2;

import java.util.ArrayList;

public class CartDemo {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        double totalCost() {
            return price * quantity;
        }

        void displayItem() {
            System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + totalCost());
        }
    }

    static class ShoppingCart {
        ArrayList<CartItem> items = new ArrayList<>();

        void addItem(CartItem item) {
            items.add(item);
            System.out.println(item.itemName + " added to cart.");
        }

        void removeItem(String itemName) {
            items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
            System.out.println(itemName + " removed from cart.");
        }

        void displayTotalCost() {
            double total = 0;
            for (CartItem item : items) {
                total += item.totalCost();
            }
            System.out.println("Total Cart Cost: $" + total);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Mouse", 500, 2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayTotalCost();

        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
