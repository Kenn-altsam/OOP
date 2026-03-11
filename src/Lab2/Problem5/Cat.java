package Lab2.Problem5;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age) {
        super(name, age, "Feline");
        this.isIndoor = true;
    }

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, "Feline");
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    @Override
    public String getSound() {
        return "Meow";
    }
}