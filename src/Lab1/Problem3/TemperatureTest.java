package Lab1.Problem3;

public class TemperatureTest {

    static void main(String[] args) {
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(98.6, 'F');

        System.out.println("100°C = " + t2.getDegreesF() + "°F");
        System.out.println("98.6°F = " + t4.getDegreesC() + "°C");

        t4.setValue(100);
        t4.setScale('Z');

        System.out.println("Current scale of t4: " + t4.getScale());

    }
}
