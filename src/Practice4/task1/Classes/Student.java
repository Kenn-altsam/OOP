package Practice4.task1.Classes;

import Practice4.task1.Interfaces.CanHavePizza;
import Practice4.task1.Interfaces.CanHaveRetake;

public class Student extends Person implements CanHavePizza, CanHaveRetake {
    private String major;
    private double gpa;

    public Student(String name, int age, String walletId, String major, double gpa) {
        super(name, age, walletId);
        this.major = major;
        this.gpa = gpa;
    }

    @Override public void eatPizza() {
        System.out.println(name + " stress-eats pizza before exams 📚");
    }

    @Override public void retakeExam(String subject) {
        System.out.println(name + " retakes " + subject + (gpa < 2.0 ? " (mandatory)" : " (by choice)"));
    }

    @Override public void move() {
        System.out.println(name + " rushes to class.");
    }
}
