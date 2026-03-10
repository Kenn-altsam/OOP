package Lab2.Problem4;

public class TestCircuit {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double equivalentResistance = circuit.getResistance();
        System.out.printf("Equivalent Resistance: %.2f Ohm  (expected 2.40)%n", equivalentResistance);

        circuit.applyPotentialDiff(12.0);
        System.out.printf("Current: %.4f A%n", circuit.getCurrent());
        System.out.printf("Power:   %.4f W%n", circuit.getPower());
    }
}
