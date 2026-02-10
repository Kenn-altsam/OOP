package Lab1.Problem2;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Kenzhe", 1000.0);
        BankAccount acc2 = new BankAccount("Sanzhar", 500.0);

        acc1.deposit(200.0);
        acc1.deposit(100);

        acc1.printInfo();
        acc2.printInfo();

        System.out.println("Bank: " + BankAccount.BANK_NAME);
        System.out.println("Total accounts: " + BankAccount.totalAccounts);
    }
}
