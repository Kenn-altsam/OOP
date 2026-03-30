package Lab3.Problem6;

class Person implements Comparable<Person>, Cloneable, Communicable, Living {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Communicable interface
    @Override
    public void speak() {
        System.out.println(name + " says: Hello, my name is " + name + "!");
    }

    @Override
    public void listen(String message) {
        System.out.println(name + " hears: '" + message + "'");
    }

    // Living interface
    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping for 8 hours");
    }

    @Override
    public void grow(int years) {
        this.age += years;
        System.out.println(name + " is now " + age + " years old");
    }

    // Comparable interface - compare by age
    @Override
    public int compareTo(Person other) {
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
        return "Person{" + name + ", age=" + age + "}";
    }
}