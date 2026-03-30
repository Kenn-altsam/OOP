package Lab3.Problem2;

public class BirdExample {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle");

        System.out.println("=== Testing Moveable Interface ===");
        eagle.move();

        System.out.println("\n=== Testing Flyable Interface ===");
        eagle.takeOff();
        eagle.move();

        eagle.climbHigher(200);
        eagle.move();

        eagle.climbHigher(300);
        System.out.println("Current speed: " + eagle.getSpeed() + " km/h");
        System.out.println("Current altitude: " + eagle.getAltitude() + " meters");

        eagle.stop();
        eagle.move();

        eagle.land();
        eagle.move();

        System.out.println("\n=== Using Polymorphism ===");
        Moveable moveable = eagle;
        moveable.move();
        moveable.stop();

        Flyable flyable = eagle;
        flyable.takeOff();
        flyable.move();
    }
}