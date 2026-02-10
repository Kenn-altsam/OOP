package Lab1.Problem5;

import java.lang.classfile.attribute.PermittedSubclassesAttribute;
import java.util.Vector;

public class DragonLunch {

    private final Vector<Person> people = new Vector<>();

    public void kidnap(Person person) {
        people.add(person);
    }

    public boolean willDragonEatOrNot() {
        int k = 0;

        for(int i = 0; i < people.size(); i++) {
            Person current = people.get(i);

            if (k > 0
                    && people.get(k - 1).getGender() == Gender.BOY
                    && current.getGender() == Gender.GIRL) {
                k--;
            } else {
                people.set(k, current);
                k++;
            }
        }

        people.setSize(k);

        return k != 0;
    }

    public String line() {
        StringBuilder sb = new StringBuilder();

        for (Person person : people) {
            sb.append(person);
        }
        return sb.toString();
    }

    public static DragonLunch formString(String s) {
        DragonLunch d1 = new DragonLunch();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            d1.kidnap(personFromChar(ch));
        }
        return d1;
    }

    public static Person personFromChar(char ch) {
        return switch (ch) {
            case 'B' -> new Person(Gender.BOY);
            case 'G' -> new Person(Gender.GIRL);
            default -> throw new IllegalArgumentException("Only G or B allowed: " + ch);
        };
    }

    static void main(String[] args) {
        String line = "BBGG";
        DragonLunch d1 = DragonLunch.formString(line);
        System.out.println("The line is: " + line);
        System.out.println(d1.willDragonEatOrNot() ? "Eat" : "No one left");
    }
}
