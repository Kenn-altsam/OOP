package Practice1;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        double c = myScanner.nextDouble();

        if (a == 0) {
            System.out.println("a must not be 0 for the equation to be quadratic");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("There are no roots");
        } else {
            double sqrtOfD = Math.sqrt(discriminant);
            if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The root is " + root);
            } else {
                double root1 = (-b + sqrtOfD) / (2 * a);
                double root2 = (-b - sqrtOfD) / (2 * a);
                System.out.println("Root1: " + root1);
                System.out.println("Root2: " + root2);
            }
        }
    }
}
