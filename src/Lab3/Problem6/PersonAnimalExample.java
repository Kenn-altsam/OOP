package Lab3.Problem6;

public class PersonAnimalExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("===== Creating People =====\n");

        Person person1 = new Person("John", 30);
        Person person2 = new Person("Sarah", 25);
        Person person3 = new Person("Mike", 35);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("\n===== Testing Communicable Interface (People) =====");
        person1.speak();
        person2.listen("How are you?");
        person3.speak();

        System.out.println("\n===== Testing Living Interface (People) =====");
        person1.eat("Pizza");
        person2.sleep();
        person3.grow(5);

        System.out.println("\n===== Testing Comparable Interface (People) =====");
        Person[] people = {person1, person2, person3};
        System.out.println("Before sorting:");
        for (Person p : people) {
            System.out.println("  " + p.getName() + " is " + p.getAge() + " years old");
        }

        java.util.Arrays.sort(people);
        System.out.println("After sorting by age:");
        for (Person p : people) {
            System.out.println("  " + p.getName() + " is " + p.getAge() + " years old");
        }

        System.out.println("\n===== Creating Animals =====\n");

        Dog dog = new Dog("Rex", 3, 25.0);
        Dog dog2 = new Dog("Max", 5, 30.0);
        Animal cat = new Cat("Whiskers", 2, 4.5);

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(cat);

        System.out.println("\n===== Testing Communicable Interface (Animals) =====");
        dog.speak();
        dog2.speak();
        cat.speak();

        System.out.println("\n===== Training the Dog =====");
        dog.train();
        dog.listen("Sit!");

        System.out.println("\n===== Testing Living Interface (Animals) =====");
        dog.eat("Dog food");
        dog2.sleep();
        cat.grow(3);

        System.out.println("\n===== Testing Comparable Interface (Animals) =====");
        Animal[] animals = {dog, cat, dog2};
        System.out.println("Before sorting:");
        for (Animal a : animals) {
            System.out.println("  " + a.getName() + " is " + a.getAge() + " years old");
        }

        java.util.Arrays.sort(animals);
        System.out.println("After sorting by age:");
        for (Animal a : animals) {
            System.out.println("  " + a.getName() + " is " + a.getAge() + " years old");
        }

        System.out.println("\n===== Testing Cloneable Interface =====");
        Dog dogClone = (Dog) dog.clone();
        System.out.println("Original: " + dog);
        System.out.println("Clone: " + dogClone);
        System.out.println("Are they the same object? " + (dog == dogClone));

        System.out.println("\n===== Polymorphism with Custom Interfaces =====");
        System.out.println("All Communicable objects speaking:");
        Communicable[] communicables = {person1, dog, cat};
        for (Communicable c : communicables) {
            c.speak();
        }
    }
}