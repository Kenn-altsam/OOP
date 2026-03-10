package Lab2.Problem3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 5;
    private static final double FEE_PER_TRANSACTION = 0.02;

    // Constructor
    public CheckingAccount(int a) {
        super(a);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
        deductFee();
    }

    private void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            double balance = this.getBalance();
            if (balance >= FEE_PER_TRANSACTION) {
                double newBalance = balance - FEE_PER_TRANSACTION;

                System.out.println("Fee deducted: $" + String.format("%.2f", FEE_PER_TRANSACTION));
            }
        }
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accNumber=" + this.getAccountNumber() +
                ", balance=$" + String.format("%.2f", this.getBalance()) +
                ", transactionCount=" + transactionCount +
                ", freeTransactions=" + FREE_TRANSACTIONS +
                '}';
    }
}
