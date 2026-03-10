package Lab2.Problem5;

public class Student extends Person {
    private String major;
    private int credits;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
        this.credits = 0;
    }

    public String getMajor() { return major; }
    public int getCredits() { return credits; }

    public void earnCredits(int amount) {
        this.credits += amount;
    }

    @Override
    public String getOccupation() { return "Student (" + major + ")"; }
}