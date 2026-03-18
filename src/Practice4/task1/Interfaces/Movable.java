package Practice4.task1.Interfaces;

public interface Movable {
    void move();

    default void spring() {
        move();
        System.out.println("...sprinting");
    }
}
