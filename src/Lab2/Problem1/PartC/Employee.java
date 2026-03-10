package Lab2.Problem1.PartC;

public class Employee extends Person {
    private String employeeID;

    public Employee(String name, int age, String employeeID) {
        super(name, age);
        this.employeeID = employeeID;
    }

    // getter
    public String getEmployeeID() {
        return employeeID;
    }

    // setter
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Person{ " + "name: " + getName() + ", age: " + getAge() + ", employeeID: " + employeeID + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return employeeID.equals(employee.employeeID);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + employeeID.hashCode();
        return result;
    }

}
