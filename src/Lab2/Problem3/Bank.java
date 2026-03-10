package Lab2.Problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added to bank.");
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    public void removeAccount(int accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println("Account " + accountNumber + " removed from bank.");
        }
    }

    public void update() {
        System.out.println("\nBANK UPDATE");
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                savingsAccount.addInterest();
                System.out.println("Interest added to: " + savingsAccount);
            } else if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                System.out.println("Processing fees for: " + checkingAccount);
            }
        }
        System.out.println("END UPDATE\n");
    }

    public Vector<Account> getAccounts() {
        return accounts;
    }

    public void printAllAccounts() {
        System.out.println("\nALL ACCOUNTS");
        for (Account account : accounts) {
            account.print();
        }
        System.out.println("END ACCOUNTS\n");
    }

    public void openAccount(Account account) {
        addAccount(account);
    }

    public void closeAccount(int accountNumber) {
        removeAccount(accountNumber);
    }
}