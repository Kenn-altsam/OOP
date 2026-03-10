package Lab2.Problem1.PartC;

import java.util.HashSet;

public class TestPerson {
    static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();

        Employee employee1 = new Employee("Alice Johnson", 28, "E001");
        Employee employee2 = new Employee("Bob Smith", 35, "E002");
        Employee employee3 = new Employee("Carol White", 32, "E003");
        Employee employee4 = new Employee("Alice Johnson", 28, "E001");
        Employee employee5 = new Employee("David Brown", 29, "E004");

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        System.out.println(" Employee HashSet Test");
        System.out.println("Total unique employees: " + employeeSet.size());
        System.out.println("\nEmployees in set: ");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }

        System.out.println("Equality Test");
        System.out.println("Employee1.equals(employee4): " + employee1.equals(employee4));
        System.out.println("Employee1.hashCode() == employee4.hashCode(): " + (employee1.hashCode() == employee4.hashCode()));
        System.out.println("Employee1.equals(employee2): " + employee1.equals(employee2));

        System.out.println("Person HashSet Test");
        HashSet<Person> personSet = new HashSet<>();
        Person person1 = new Person("John Doe", 45);
        Person person2 = new Person("Jane Smith", 40);
        Person person3 = new Person("John Doe", 45);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("Total unique people: " + personSet.size());
        System.out.println("\nPeople in set: ");
        for (Person person : personSet) {
            System.out.println(person);
        }
    }
}
