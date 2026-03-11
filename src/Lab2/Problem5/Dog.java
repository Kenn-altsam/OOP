package Lab2.Problem5;

public class Dog extends Animal {
    private String temperament;

    public Dog(String name, int age) {
        super(name, age, "Canine");
        this.temperament = "Friendly";
    }

    public Dog(String name, int age, String temperament) {
        super(name, age, "Canine");
        this.temperament = temperament;
    }

    public String getTemperament() {
        return temperament;
    }

    @Override
    public String getSound() {
        return "Woof!";
    }
}