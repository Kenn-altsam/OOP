package Lab2.Problem1.PartA;

public class Cube extends Shape3D {
    private double sideLength;

    public Cube(double side) {
        this.sideLength = side;
    }

    @Override
    public double volume() {
        return sideLength * sideLength * sideLength;
    }

    @Override
    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }
}
