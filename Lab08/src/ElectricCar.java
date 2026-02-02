// Các Interface
interface Movable {
    void move();
    default void stop() {
        System.out.println("Stopping");
    }
}

interface FuelConsumable {
    double getFuelConsumption();
}

interface ElectricChargeable {
    void charge();
}

// Các Class
class Car implements Movable, FuelConsumable {
    @Override public void move() { System.out.println("Car is driving"); }
    @Override public double getFuelConsumption() { return 7.5; } // lít/100km
}

class Bicycle implements Movable {
    @Override public void move() { System.out.println("Bicycle is pedaling"); }
    // Override phương thức default
    @Override public void stop() { System.out.println("Using brakes to stop bicycle"); }
}

class ElectricCar implements Movable, FuelConsumable, ElectricChargeable {
    @Override public void move() { System.out.println("ElectricCar is moving silently"); }
    @Override public double getFuelConsumption() { return 0; } // Không tốn xăng
    @Override public void charge() { System.out.println("Charging battery..."); }
}
