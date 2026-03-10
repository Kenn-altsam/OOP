package Lab2.Problem4;

public class Resistor extends Circuit {
    private final double resistance;
    private double voltage;

    public Resistor(double resistance) {
        if (resistance < 0) {
            throw new IllegalArgumentException("Resistance must be non-negative");
        }
        this.resistance = resistance;
        this.voltage = 0.0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return voltage;
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.voltage = v;
    }
}