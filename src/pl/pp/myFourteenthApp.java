package pl.pp;

// Abstract class Vehicle
abstract class Vehicle {
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;

    public Vehicle(String registrationNumber, String vinNumber, String color, double price,
                   double fuelConsumption, double fuelLevel, double mileage) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
    }

    public void refuel(double amount) {
        this.fuelLevel += amount;
    }
}

// PassengerCar class
class PassengerCar extends Vehicle {

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price,
                        double fuelConsumption, double fuelLevel, double mileage, int ignoredNumberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
    }

    public void drive(double distance) {
        double fuelNeeded = distance * (fuelConsumption / 100);
        if (fuelLevel >= fuelNeeded) {
            mileage += distance;
            fuelLevel -= fuelNeeded;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }
}

// Truck class
class Truck extends Vehicle {

    public Truck(String registrationNumber, String vinNumber, String color, double price,
                 double fuelConsumption, double fuelLevel, double mileage, double ignoredLoadCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
    }

}

// Motorcycle class
class Motorcycle extends Vehicle {

    public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                      double fuelConsumption, double fuelLevel, double mileage, boolean ignoredHasSidecar) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
    }

    public void drive(double distance) {
        double fuelNeeded = distance * (fuelConsumption / 100);
        if (fuelLevel >= fuelNeeded) {
            mileage += distance;
            fuelLevel -= fuelNeeded;
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }
}

// ConstructionEquipment class
class ConstructionEquipment extends Vehicle {
    double hoursWorked;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price,
                                 double fuelConsumption, double fuelLevel, double mileage, double hoursWorked) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
    }

    public void drive(double distance) {
        double fuelNeeded = distance * (fuelConsumption / 100);
        if (fuelLevel >= fuelNeeded) {
            mileage += distance;
            fuelLevel -= fuelNeeded;
            hoursWorked += distance / 10; // Assume 10 km per hour of work
        } else {
            System.out.println("Not enough fuel to drive the distance.");
        }
    }
}

// RentalTest class
public class myFourteenthApp {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("ABC123", "1HGCM82633A123456", "Red", 20000, 8, 50, 10000, 4);
        Truck truck = new Truck("XYZ789", "1HTMMAAL05H123456", "Blue", 50000, 15, 100, 20000, 15000);
        Motorcycle motorcycle = new Motorcycle("MNO456", "JH2SC59J77M123456", "Black", 15000, 5, 20, 5000, true);
        ConstructionEquipment excavator = new ConstructionEquipment("CON123", "JCB1234567890", "Yellow", 80000, 20, 200, 3000, 500);

        car.drive(100);
        truck.refuel(50);
        motorcycle.drive(50);
        excavator.drive(10);

        System.out.println("Car mileage: " + car.mileage + " km, Fuel level: " + car.fuelLevel + " liters");
        System.out.println("Truck mileage: " + truck.mileage + " km, Fuel level: " + truck.fuelLevel + " liters");
        System.out.println("Motorcycle mileage: " + motorcycle.mileage + " km, Fuel level: " + motorcycle.fuelLevel + " liters");
        System.out.println("Construction Equipment mileage: " + excavator.mileage + " km, Fuel level: " + excavator.fuelLevel + " liters, Hours worked: " + excavator.hoursWorked);
    }
}
