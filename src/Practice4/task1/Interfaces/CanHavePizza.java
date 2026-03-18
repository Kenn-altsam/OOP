package Practice4.task1.Interfaces;

public interface CanHavePizza {
    int PIZZA_SIZE = 8;

    void eatPizza();

    default String getPizzaPreference() {
        return "Margarita";
    }
}
