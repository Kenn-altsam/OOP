package Lab3.Problem6;
class Dog extends Animal {
    private boolean isTrained;

    public Dog(String name, int age, double weight) {
        super(name, "Dog", age, weight);
        this.isTrained = false;
    }

    public void train() {
        isTrained = true;
        System.out.println(name + " has been trained!");
    }

    @Override
    public void speak() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    @Override
    public void listen(String message) {
        if (isTrained) {
            System.out.println(name + " (trained) obeys: " + message);
        } else {
            System.out.println(name + " (untrained) ignores you");
        }
    }

    @Override
    public void play() {
        System.out.println(name + " is playing fetch!");
    }
}