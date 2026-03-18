package Practice4.Classes;

import Practice4.Interfaces.CanHavePizza;

public class Restaurant {
    private String name;
    private double pizzaPrice;

    public Restaurant(String name, double pizzaPrice) {
        this.name       = name;
        this.pizzaPrice = pizzaPrice;
    }

    public boolean servePizza(CanHavePizza eater) {
        System.out.println("\n[" + name + "] Serving "
                + eater.getPizzaPreference() + " pizza...");

        eater.eatPizza();

        if (eater instanceof Person person) {
            processPayment(person);
            return true;
        }

        System.out.println("No payment needed — house guest!");
        return false;
    }

    private void processPayment(Person person) {
        System.out.println(person.getName() + " pays $"
                + pizzaPrice + " via wallet " + person.getWalletId());
    }
}
