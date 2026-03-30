package Lab3.Problem1;

abstract class Vehicle {
    protected String model;
    protected int year;
    protected double fuelConsumption; // liters per km

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // CONCRETE METHOD - shared by all vehicles
    public double calculateFuelNeeded(double distance) {
        return distance * fuelConsumption;
    }

    // ABSTRACT METHODS - must be implemented by subclasses
    abstract void accelerate();
    abstract void brake();
    abstract void honk();
}

