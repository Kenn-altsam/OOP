package Lab3.Problem1;

class Car extends Vehicle {
    public Car(String model, int year) {
        super(model, year);
        this.fuelConsumption = 0.07; // 7 liters per 100 km
    }

    @Override
    void accelerate() {
        System.out.println("Car " + model + " accelerates smoothly");
    }

    @Override
    void brake() {
        System.out.println("Car " + model + " applies disc brakes");
    }

    @Override
    void honk() {
        System.out.println("Car: BEEP BEEP");
    }
}