public class BankAccountDemo {
    static class BankAccount {
        static String bankName = "Global Bank";
        private static int totalAccounts = 0;

        final int accountNumber;
        String accountHolderName;
        double balance;

        BankAccount(String accountHolderName, int accountNumber, double balance) {
            this.accountHolderName = accountHolderName; // this resolves ambiguity
            this.accountNumber = accountNumber;
            this.balance = balance;
            totalAccounts++;
        }

        void displayDetails() {
            if (this instanceof BankAccount) {
                System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber + ", Balance: $" + balance);
            }
        }

        static void getTotalAccounts() {
            System.out.println("Total Accounts: " + totalAccounts);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Deepti", 101, 5000);
        BankAccount acc2 = new BankAccount("Ravi", 102, 3000);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
