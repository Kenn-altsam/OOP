package Lab3.Problem1;

public class VehicleExample {

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", 2023);
        Vehicle truck = new Truck("Volvo FH16", 2022);

        Vehicle[] vehicles = {car, truck};

        for (Vehicle v : vehicles) {
            v.accelerate();
            v.honk();
            double fuel = v.calculateFuelNeeded(100); // 100 km trip
            System.out.println("Fuel needed for 100 km: " + fuel + " liters");
            v.brake();
            System.out.println();
        }
    }

}