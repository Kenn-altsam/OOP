package Lab2.Problem5;

public class Employee extends Person {
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = 0.0;
    }

    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() { return jobTitle; }
    public double getSalary() { return salary; }

    @Override
    public String getOccupation() { return "Employee (" + jobTitle + ")"; }
}