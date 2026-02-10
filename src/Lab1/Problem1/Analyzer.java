package Lab1.Problem1;

import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String token = sc.next().trim();

            if (token.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(token);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or Q.");
            }
        }

        if (data.getCount() == 0) {
            System.out.println("No data entered.");
        } else {
            System.out.println("Average = " + data.getAverage());
            System.out.println("Maximum = " + data.getMaximum());
        }

        sc.close();
    }
}
