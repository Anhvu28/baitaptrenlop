class CPU {
    String brand;
    String speed;

    public CPU(String brand, String speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Computer {
    String model;
    CPU cpu; // Kết tập

    public Computer(String model, CPU cpu) {
        this.model = model;
        this.cpu = cpu;
    }

    public void displayInfo() {
        System.out.println("PC Model: " + model);
        System.out.println("CPU: " + cpu.brand + " (" + cpu.speed + ")");
    }
}

public class Bai9 {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i9", "5.0GHz");
        Computer pc = new Computer("Dell XPS", cpu);
        
        pc.displayInfo();
    }
}