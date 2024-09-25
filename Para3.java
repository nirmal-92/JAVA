// Define the BankAccount class
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal of $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal of $" + amount + " not allowed. Minimum balance of $100 must be maintained.");
        }
    }
}

public class Para3 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(200.0);
        savingsAccount.deposit(50.0);
        savingsAccount.withdraw(150.0);
        savingsAccount.withdraw(100.0);
        System.out.println("Current balance: $" + savingsAccount.getBalance());
    }
}
