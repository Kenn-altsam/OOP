package Lab2.Problem5;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age, "Avian");
    }

    public Bird(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public String getSound() {
        return "♪ Tweet ♪";
    }
}