package Practice1;

//import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        double initialBalance = 2000.0;
        double interestRate = 10.0;

        double interest = initialBalance * interestRate / 100.0;
        double newBalance = initialBalance + interest;

        System.out.println("New balance is: " + newBalance);
    }
}
