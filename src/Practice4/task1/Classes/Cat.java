package Practice4.task1.Classes;

import Practice4.task1.Interfaces.CanHavePizza;

public class Cat extends Animal implements CanHavePizza {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override public void eatPizza() {
        System.out.println(name + " nibbles the crust 🐱");
    }

    @Override public String getPizzaPreference() {
        return "Tuna & anchovy";
    }

    @Override public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override public void move() {
        System.out.println(name + " pads silently.");
    }

    public void purr() {
        System.out.println(name + " purrs contentedly.");
    }
}
