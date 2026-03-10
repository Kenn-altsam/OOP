package Lab2.Problem4;

public class Parallel extends Circuit {
    private final Circuit first;
    private final Circuit second;
    private double voltage;

    public Parallel(Circuit first, Circuit second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Circuits cannot be null");
        }
        this.first = first;
        this.second = second;
        this.voltage = 0.0;
    }

    @Override
    public double getResistance() {
        double r1 = first.getResistance();
        double r2 = second.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() {
        return voltage;
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.voltage = v;
        first.applyPotentialDiff(v);
        second.applyPotentialDiff(v);
    }
}