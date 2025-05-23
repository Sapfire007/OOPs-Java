// package FAT-Paper1;

class Vehicle {
    String vehicleId;
    String vehicleName;
    double fuelCapacity;
    double maxSpeed;
    protected boolean engineOn = false;

    public Vehicle(String vId, String vN, double fCap, double mSpd) {
        vehicleId = vId;
        vehicleName = vN;
        fuelCapacity = fCap;
        maxSpeed = mSpd;
    }

    public void startEngine() {
        engineOn = true;
    }

    public void stopEngine() {
        engineOn = false;
    }
}

class Car extends Vehicle {
    private double time;
    private int distance;

    public Car(String vId, String vN, double fCap, double mSpd) {
        super(vId, vN, fCap, mSpd);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Car engine started.");
    }

    public double calculateTime(int distance) {
        if (!engineOn) {
            System.out.println("Car engine is OFF. Cannot calculate time.");
            return 0;
        }
        this.distance = distance;
        time = distance / maxSpeed;
        return time;
    }

    @Override
    public void stopEngine() {
        if (engineOn) {
            super.stopEngine();
            System.out.println("Car engine stopped.");
            System.out.println("Time to travel " + distance + " km: " + time + " hours");
        } else {
            System.out.println("Car engine already OFF.");
        }
    }
}

class Truck extends Vehicle {
    private double time;
    private int distance;

    public Truck(String vId, String vN, double fCap, double mSpd) {
        super(vId, vN, fCap, mSpd);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Truck engine started.");
    }

    public double calculateTime(int distance) {
        if (!engineOn) {
            System.out.println("Truck engine is OFF. Cannot calculate time.");
            return 0;
        }
        this.distance = distance;
        time = distance / maxSpeed;
        return time;
    }

    @Override
    public void stopEngine() {
        if (engineOn) {
            super.stopEngine();
            System.out.println("Truck engine stopped.");
            System.out.println("Time to travel " + distance + " km: " + time + " hours");
        } else {
            System.out.println("Truck engine already OFF.");
        }
    }
}

class Motorcycle extends Vehicle {
    private double time;
    private int distance;

    public Motorcycle(String vId, String vN, double fCap, double mSpd) {
        super(vId, vN, fCap, mSpd);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Motorcycle engine started.");
    }

    public double calculateTime(int distance) {
        if (!engineOn) {
            System.out.println("Motorcycle engine is OFF. Cannot calculate time.");
            return 0;
        }
        this.distance = distance;
        time = distance / maxSpeed;
        return time;
    }

    @Override
    public void stopEngine() {
        if (engineOn) {
            super.stopEngine();
            System.out.println("Motorcycle engine stopped.");
            System.out.println("Time to travel " + distance + " km: " + time + " hours");
        } else {
            System.out.println("Motorcycle engine already OFF.");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car c1 = new Car("WB10023XX43", "Tata Nano", 50.5, 70);
        c1.calculateTime(1000); // Should warn
        c1.startEngine();
        c1.calculateTime(1000); // Should work
        c1.stopEngine();

        System.out.println();

        Truck t1 = new Truck("WB17823XX59", "Tata Leyand", 1000, 150);
        t1.startEngine();
        t1.calculateTime(1000);
        t1.stopEngine();

        System.out.println();

        Motorcycle b1 = new Motorcycle("WB10023XX12", "Super Splendor", 10.5, 90);
        b1.startEngine();
        b1.calculateTime(500);
        b1.stopEngine();
    }
}