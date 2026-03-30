package Lab3.Problem4;

import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

public class ManagerExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("===== Creating Employees and Managers =====\n");

        Date date1 = new Date(2020, 0, 15);
        Date date2 = new Date(2019, 5, 20);
        Date date3 = new Date(2021, 2, 10);
        Date date4 = new Date(2018, 8, 5);

        Employee emp1 = new Employee("Alice Johnson", 50000, date1, "INS001");
        Employee emp2 = new Employee("Bob Smith", 55000, date2, "INS002");
        Employee emp3 = new Employee("Charlie Brown", 45000, date3, "INS003");

        Manager mgr1 = new Manager("Diana Prince", 90000, date4, "INS004");
        mgr1.setBonus(20000);

        Manager mgr2 = new Manager("Eve Wilson", 85000, date4, "INS005");
        mgr2.setBonus(15000);

        System.out.println("Employees:");
        System.out.println("  " + emp1);
        System.out.println("  " + emp2);
        System.out.println("  " + emp3);

        System.out.println("\nManagers:");
        System.out.println("  " + mgr1);
        System.out.println("  " + mgr2);

        System.out.println("\n===== Building Teams =====\n");

        mgr1.addToTeam(emp1);
        mgr1.addToTeam(emp2);
        mgr2.addToTeam(emp3);

        System.out.println(mgr1.getName() + "'s team:");
        for (Employee e : mgr1.getTeam()) {
            System.out.println("  - " + e);
        }

        System.out.println("\n" + mgr2.getName() + "'s team:");
        for (Employee e : mgr2.getTeam()) {
            System.out.println("  - " + e);
        }

        System.out.println("\n===== Sorting Employees by Salary (Comparable) =====\n");

        Employee[] allEmployees = {emp1, emp2, emp3, mgr1, mgr2};

        System.out.println("Before sorting:");
        for (Employee e : allEmployees) {
            System.out.println("  " + e);
        }

        java.util.Arrays.sort(allEmployees);

        System.out.println("\nAfter sorting (by salary, managers by bonus if equal):");
        for (Employee e : allEmployees) {
            System.out.println("  " + e);
        }

        System.out.println("\n===== Testing Clone Method =====\n");

        Manager mgrClone = mgr1.clone();

        System.out.println("Original Manager: " + mgr1);
        System.out.println("Cloned Manager: " + mgrClone);
        System.out.println("Are they the same object? " + (mgr1 == mgrClone));
        System.out.println("Original team size: " + mgr1.getTeam().size());
        System.out.println("Cloned team size: " + mgrClone.getTeam().size());

        System.out.println("\nModifying cloned manager's bonus to $50,000...");
        mgrClone.setBonus(50000);
        System.out.println("Original bonus: $" + mgr1.getBonus());
        System.out.println("Cloned bonus: $" + mgrClone.getBonus());
    }
}
