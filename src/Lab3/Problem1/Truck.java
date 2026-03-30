package Lab3.Problem1;

class Truck extends Vehicle {
    public Truck(String model, int year) {
        super(model, year);
        this.fuelConsumption = 0.15; // 15 liters per 100 km
    }

    @Override
    void accelerate() {
        System.out.println("Truck " + model + " accelerates slowly");
    }

    @Override
    void brake() {
        System.out.println("Truck " + model + " applies air brakes");
    }

    @Override
    void honk() {
        System.out.println("Truck: HONK HONK");
    }
}
