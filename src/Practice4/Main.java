package Practice4;

import Practice4.Interfaces.CanHavePizza;
import Practice4.Classes.Restaurant;
import Practice4.Classes.Cat;
import Practice4.Classes.Student;
import Practice4.Classes.Animal;

public class Main {
    public static void main(String[] args) {

        Restaurant delPapa = new Restaurant("Del Papa", 12.99);

        Cat whiskers = new Cat("Whiskers", 3, "tabby");
        delPapa.servePizza(whiskers);
        whiskers.purr();

        Student asel = new Student("Asel", 20, "W-7821", "CS", 3.4);
        delPapa.servePizza(asel);
        asel.retakeExam("Algorithms");

        CanHavePizza[] eaters = { whiskers, asel };
        System.out.println("\n--- Preferences ---");
        for (CanHavePizza e : eaters) {
            System.out.println(e.getPizzaPreference());
        }
        
        for (CanHavePizza e : eaters) {
            if (e instanceof Animal a) a.breathe();
        }
    }
}
