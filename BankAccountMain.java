class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: %.2f%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        // Local variable records whether withdrawal succeeded.
        boolean success;
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else {
            success = false;
        }

        if (success) System.out.printf("Withdrawal successful: %.2f%n", amount);
        else System.out.println("Withdrawal failed: invalid amount or insufficient balance.");
    }

    double getBalance() { return balance; }

    void displayAccount() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: %.2f%n", getBalance());
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Altamash", 5000.00);
        account.deposit(1000.00);
        account.withdraw(750.00);
        account.withdraw(10000.00);
        account.displayAccount();
    }
}
