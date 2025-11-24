
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Error: Withdrawal amount exceeds available balance!"
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
    }
}
public class MainATM {
    public static void main(String[] args) {

        ATM atm = new ATM(10000); 

        try {
            atm.withdraw(12000);  
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("ATM system running smoothly.");
    }
}

