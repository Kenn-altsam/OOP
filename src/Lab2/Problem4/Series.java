package Lab2.Problem4;

public class Series extends Circuit {
    private final Circuit first;
    private final Circuit second;
    private double voltage;

    public Series(Circuit first, Circuit second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Circuits cannot be null");
        }
        this.first = first;
        this.second = second;
        this.voltage = 0.0;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return voltage;
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.voltage = v;
        double totalResistance = getResistance();
        if (totalResistance > 0) {
            double current = v / totalResistance;
            first.applyPotentialDiff(current * first.getResistance());
            second.applyPotentialDiff(current * second.getResistance());
        }
    }
}