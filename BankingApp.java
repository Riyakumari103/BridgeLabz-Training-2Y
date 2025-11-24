import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) { super(msg); }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) { super(msg); }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) { super(msg); }
}
class Transaction {
    private Random rand = new Random();
    private int balance;

    public Transaction(int balance) {
        this.balance = balance;
    }

    public void process(int amount) throws NegativeAmountException,
                                           InsufficientFundsException,
                                           NetworkFailureException {
        int outcome = rand.nextInt(4); // 0,1,2,3

        switch (outcome) {
            case 0:
                if (amount < 0) throw new NegativeAmountException("Transaction failed: Negative amount not allowed!");
                System.out.println("Transaction successful! Amount: ₹" + amount);
                balance -= amount;
                break;
            case 1:
                throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
            case 2:
                throw new NetworkFailureException("Transaction failed: Network issue occurred!");
            case 3:
        
                System.out.println("Transaction successful! Amount: ₹" + amount);
                balance -= amount;
                break;
        }
    }

    public int getBalance() { return balance; }
}
public class BankingApp {
    public static void main(String[] args) {
        Transaction txn = new Transaction(10000);
        int amount = 5000;

        try {
            txn.process(amount);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

