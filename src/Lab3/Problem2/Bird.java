package Lab3.Problem2;

class Bird implements Flyable {
    private String name;
    private int currentSpeed;
    private int currentAltitude;
    private boolean isFlying;

    public Bird(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentAltitude = 0;
        this.isFlying = false;
    }

    // From Moveable interface
    @Override
    public void move() {
        if (isFlying && currentSpeed > 0) {
            System.out.println(name + " is flying at " + currentSpeed + " km/h");
            System.out.println("  Altitude: " + currentAltitude + " meters");
        } else if (!isFlying && currentSpeed > 0) {
            System.out.println(name + " is walking at " + currentSpeed + " km/h");
        } else {
            System.out.println(name + " is standing still");
        }
    }

    @Override
    public void stop() {
        currentSpeed = 0;
        if (isFlying) {
            System.out.println(name + " is gliding to a stop");
        } else {
            System.out.println(name + " has stopped walking");
        }
    }

    @Override
    public int getSpeed() {
        return currentSpeed;
    }

    // From Flyable interface
    @Override
    public void takeOff() {
        if (!isFlying) {
            isFlying = true;
            currentSpeed = 25;
            currentAltitude = 100;
            System.out.println(name + " takes off from the ground");
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            isFlying = false;
            currentSpeed = 0;
            currentAltitude = 0;
            System.out.println(name + " lands on the ground");
        }
    }

    @Override
    public int getAltitude() {
        return currentAltitude;
    }

    // Helper method to gain altitude
    public void climbHigher(int meters) {
        if (isFlying) {
            currentAltitude += meters;
            System.out.println(name + " climbs to " + currentAltitude + " meters");
        }
    }
}
