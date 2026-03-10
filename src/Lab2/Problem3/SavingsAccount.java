package Lab2.Problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }

    public void addInterest() {
        double interest = this.getBalance() * (interestRate / 100.0);
        this.deposit(interest);
        System.out.println("Interest added: $" + String.format("%.2f", interest));
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        if (rate > 0) {
            interestRate = rate;
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accNumber=" + this.getAccountNumber() +
                ", balance=$" + String.format("%.2f", this.getBalance()) +
                ", interestRate=" + interestRate + "%" +
                '}';
    }
}
