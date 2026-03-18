package Practice4.task1.Classes;

import Practice4.task1.Interfaces.Movable;

public abstract class Animal implements Movable {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    public void breathe() {
        System.out.println(name + " breathes.");
    }

    public abstract void makeSound();
}
