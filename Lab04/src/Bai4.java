class Employee {
    String id;
    String name;
    double salary;

    // Constructor 1 tham số
    public Employee(String name) {
        this.name = name;
    }

    // Constructor 3 tham số
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        // Logic kiểm tra lương
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void display() {
        System.out.println("NV: " + name + " - Lương: " + salary);
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Le Van C"); // Chỉ có tên
        Employee e2 = new Employee("NV02", "Pham Thi D", -5000); // Lương âm
        Employee e3 = new Employee("NV03", "Hoang Van E", 1000);

        e1.display();
        e2.display(); // Sẽ hiện lương = 0
        e3.display();
    }
}