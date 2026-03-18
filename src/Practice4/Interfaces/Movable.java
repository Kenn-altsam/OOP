package Practice4.Interfaces;

public interface Movable {
    void move();

    default void spring() {
        move();
        System.out.println("...sprinting");
    }
}
