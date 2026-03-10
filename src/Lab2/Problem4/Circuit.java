package Lab2.Problem4;

public abstract class Circuit {
    protected static final double EPSILON = 1e-10;

    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double v);

    public double getCurrent() {
        double r = getResistance();
        if (r < EPSILON) {
            throw new IllegalStateException("Resistance too close to zero");
        }
        return getPotentialDiff() / r;
    }

    public double getPower() {
        double v = getPotentialDiff();
        double r = getResistance();
        return (r < EPSILON) ? 0.0 : (v * v) / r;
    }
}
