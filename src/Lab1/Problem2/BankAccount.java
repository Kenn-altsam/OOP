package Lab1.Problem2;

import java.util.UUID;

public class BankAccount {
    public enum Status {
        ACTIVE("Active"),
        FROZEN("Frozen"),
        CLOSED("Closed");

        private final String statusName;

        Status(String statusName) {
            this.statusName = statusName;
        }

        public String getStatusName() {
            return statusName;
        }
    }

    public static final String BANK_NAME = "Kenzhe Bank";

    public static int totalAccounts;

    public final String accountID;

    private final long createdAt;

    private String ownerName;
    private double balance;
    private Status status;

    {
        totalAccounts++; // initialization block
    }

    static {
        System.out.println(BANK_NAME + " system loaded");
    }

    public BankAccount(String ownerName, double balance) {
        this.accountID = UUID.randomUUID().toString();
        this.ownerName = ownerName;
        this.balance = balance;
        this.createdAt = System.currentTimeMillis();
        this.status = Status.ACTIVE;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(int amount) {
        deposit((double) amount);
    }

    public void printInfo() {
        System.out.println("Account: " + ownerName + ", Balance: $" + balance);
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public String getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

}
