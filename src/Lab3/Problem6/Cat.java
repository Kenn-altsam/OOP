package Lab3.Problem6;

class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, "Cat", age, weight);
    }

    @Override
    public void speak() {
        System.out.println(name + " meows: Meow! Meow!");
    }

    @Override
    public void listen(String message) {
        System.out.println(name + " hears '" + message + "' and flicks its tail");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing with a ball of yarn!");
    }
}
