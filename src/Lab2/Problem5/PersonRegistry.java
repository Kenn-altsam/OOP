package Lab2.Problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> getPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (!person.hasPet()) result.add(person);
        }
        return result;
    }

    public int getTotalPeople() {
        return people.size();
    }

    public void displayPetStatus() {
        System.out.println("--- Pet Status Report ---");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Registry ===\n");
        for (Person person : people) {
            sb.append(person).append("\n");
        }

        return sb.toString();
    }
}