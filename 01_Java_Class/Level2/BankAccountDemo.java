package Level2;

public class BankAccountDemo {
    static class BankAccount {
        String accountHolder;
        int accountNumber;
        double balance;

        BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited. Current balance: $" + balance);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount + " withdrawn. Current balance: $" + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        void displayBalance() {
            System.out.println("Account Holder: " + accountHolder + ", Account No: " + accountNumber + ", Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Riya", 101, 5000);
        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.withdraw(7000); // insufficient
        acc.displayBalance();
    }
}
