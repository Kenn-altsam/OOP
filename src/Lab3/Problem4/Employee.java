package Lab3.Problem4;

import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    // Compare by salary (higher salary = higher rank)
    @Override
    public int compareTo(Employee other) {
        if (this.salary > other.salary) return -1;  // descending
        if (this.salary < other.salary) return 1;
        return 0;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = new Date(this.hireDate.getTime());
        return cloned;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return name + " | Salary: $" + String.format("%,.2f", salary) +
                " | Hired: " + sdf.format(hireDate);
    }
}