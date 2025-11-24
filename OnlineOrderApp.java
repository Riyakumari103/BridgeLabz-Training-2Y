import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}
class OrderSystem {
    private Random rand = new Random();

    public void placeOrder(String product) throws OutOfStockException, PaymentFailedException {
        int outcome = rand.nextInt(3); // 0,1,2

        switch (outcome) {
            case 0:
                System.out.println("Order placed successfully for " + product + "!");
                break;
            case 1:
                throw new OutOfStockException("Sorry, " + product + " is out of stock.");
            case 2:
                throw new PaymentFailedException("Payment failed for " + product + ".");
        }
    }
}


public class OnlineOrderApp {
    public static void main(String[] args) {
        OrderSystem system = new OrderSystem();
        String product = "Laptop";

        try {
            system.placeOrder(product);
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
    }
}

