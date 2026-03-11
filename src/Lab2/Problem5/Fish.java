package Lab2.Problem5;

public class Fish extends Animal {
    private String waterType;

    public Fish(String name, int age) {
        super(name, age, "Aquatic");
        this.waterType = "Freshwater";
    }

    public Fish(String name, int age, String waterType) {
        super(name, age, "Aquatic");
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    @Override
    public String getSound() {
        return "...blub blub...";
    }
}