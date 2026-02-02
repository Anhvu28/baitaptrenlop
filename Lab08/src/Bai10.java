
// Main
public class Bai10 {
    public static void main(String[] args) {
        // Tạo mảng Movable chứa các loại xe khác nhau
        Movable[] vehicles = new Movable[3];
        vehicles[0] = (Movable) new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new ElectricCar();

        System.out.println("--- TRAFFIC SYSTEM ---");
        for (Movable m : vehicles) {
            m.move();
            m.stop();
            
            // Kiểm tra và ép kiểu để gọi các phương thức riêng biệt
            if (m instanceof ElectricChargeable electricChargeable) {
                electricChargeable.charge();
            }
            if (m instanceof FuelConsumable fuelConsumable) {
                System.out.println("Fuel consumption: " + fuelConsumable.getFuelConsumption());
            }
            System.out.println("-----------------");
        }
    }
}