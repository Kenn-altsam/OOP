package Lab2.Problem5;

public abstract class Animal {
    private String name;
    private int age;
    private String breed;

    public Animal(String name, int age) {
        this(name, age, "Unknown");
    }

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getBreed() { return breed; }

    public abstract String getSound();

    public void grow() {
        age++;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + name + " (" + breed + "), age " + age + ", says: " + getSound() + "]";
    }
}