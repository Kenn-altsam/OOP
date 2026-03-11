package Lab2.Problem5;

public class TestPetSystem {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer", 75000);
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 22, "Biology");

        Animal murka = new Cat("Murka", 5, true);
        Animal rex = new Dog("Rex", 3, "Friendly");
        Animal tweety = new Bird("Tweety", 2, "Canary");
        Animal goldie = new Fish("Goldie", 1, "Saltwater");

        john.assignPet(murka);
        bob.assignPet(tweety);

        System.out.println("--- Trying to assign Dog to PhD student ---");
        alice.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println("\n--- Initial State ---");
        System.out.println(registry);

        System.out.println("--- John leaves pet with Alice ---");
        john.leavePetWith(alice);
        System.out.println(registry);

        System.out.println("--- John retrieves pet from Alice ---");
        john.retrievePetFrom(alice);
        System.out.println(registry);

        System.out.println("--- Bob leaves pet with John ---");
        bob.leavePetWith(john);
        System.out.println(registry);

        System.out.println("--- Summary ---");
        System.out.println("Total people: " + registry.getTotalPeople());
        System.out.println("People with pets: " + registry.getPeopleWithPets().size());
        System.out.println("People without pets: " + registry.getPeopleWithoutPets().size());
    }
}