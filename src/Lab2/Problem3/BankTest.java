package Lab2.Problem3;

public class BankTest {
    public static void main(String[] args) {
        System.out.println("BANK ACCOUNT SYSTEM TEST\n");

        Bank bank = new Bank();

        Account regularAccount = new Account(1001);
        SavingsAccount savingsAccount = new SavingsAccount(1002, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount(1003);

        bank.openAccount(regularAccount);
        bank.openAccount(savingsAccount);
        bank.openAccount(checkingAccount);

        System.out.println("\nINITIAL ACCOUNT STATES");
        bank.printAllAccounts();

        System.out.println("\nREGULAR ACCOUNT OPERATIONS");
        regularAccount.deposit(1000);
        regularAccount.withdraw(200);
        regularAccount.print();

        System.out.println("\nSAVINGS ACCOUNT OPERATIONS");
        savingsAccount.deposit(5000);
        savingsAccount.print();
        savingsAccount.addInterest();
        savingsAccount.print();

        System.out.println("\nCHECKING ACCOUNT OPERATIONS");
        checkingAccount.deposit(2000);
        checkingAccount.withdraw(100);
        checkingAccount.withdraw(50);
        checkingAccount.print();

        System.out.println("\nTRANSFER OPERATION");
        regularAccount.transfer(300, savingsAccount);
        System.out.println("Regular Account: " + regularAccount.getBalance());
        System.out.println("Savings Account: " + savingsAccount.getBalance());


        bank.update();

        System.out.println("\n--- FINAL ACCOUNT STATES ---");
        bank.printAllAccounts();

        System.out.println("\n--- CLOSE ACCOUNT ---");
        bank.closeAccount(1001);
        bank.printAllAccounts();
    }
}