package Lab2.Problem3;

public class Account {
    private double balance;
    private int accountNumber;

    // Constructor
    public Account(int a) {
        balance = 0.0;
        accountNumber = a;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
            System.out.println("Deposited: $" + sum);
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
            System.out.println("Withdrawn: $" + sum);
        } else if (sum > balance) {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
            System.out.println("Transferred: $" + amount + " to account " + other.getAccountNumber());
        } else {
            System.out.println("Transfer failed!");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accountNumber +
                ", balance=$" + String.format("%.2f", balance) +
                '}';
    }

    public final void print() {
        System.out.println(this.toString());
    }
}
