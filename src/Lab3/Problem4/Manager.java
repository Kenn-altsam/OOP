package Lab3.Problem4;

import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

class Manager extends Employee {
    protected Vector<Employee> team;
    protected double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = 0;
    }

    public void addToTeam(Employee emp) {
        team.add(emp);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    // Override compareTo - compare by salary, then by bonus if equal
    @Override
    public int compareTo(Employee other) {
        int salaryComparison = super.compareTo(other);
        if (salaryComparison != 0) return salaryComparison;

        if (other instanceof Manager) {
            Manager otherMgr = (Manager) other;
            if (this.bonus > otherMgr.bonus) return -1;
            if (this.bonus < otherMgr.bonus) return 1;
        }
        return 0;
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>(this.team);
        return cloned;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return name + " (Manager) | Salary: $" + String.format("%,.2f", salary) +
                " | Bonus: $" + String.format("%,.2f", bonus) +
                " | Team: " + team.size() + " people | Hired: " + sdf.format(hireDate);
    }
}