package Lab3.Problem6;

abstract class Animal implements Comparable<Animal>, Cloneable, Communicable, Living {
    protected String name;
    protected String species;
    protected int age;
    protected double weight;  // in kg

    public Animal(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    // Communicable interface
    @Override
    public void speak() {
        System.out.println(name + " makes a sound!");
    }

    @Override
    public void listen(String message) {
        System.out.println(name + " listens carefully");
    }

    // Living interface
    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void grow(int years) {
        this.age += years;
        this.weight += (years * 1.0);  // Grows heavier
        System.out.println(name + " is now " + age + " years old and weighs " + weight + " kg");
    }

    // Comparable interface - compare by age
    @Override
    public int compareTo(Animal other) {
        if (this.age > other.age) return 1;
        if (this.age < other.age) return -1;
        return 0;
    }

    // Cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Animal{" + name + " (" + species + "), age=" + age + ", weight=" + weight + " kg}";
    }

    public abstract void play();
}
