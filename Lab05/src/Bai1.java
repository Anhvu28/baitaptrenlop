import java.util.Scanner;

class Address {
    String street, city;

    public void input(Scanner sc) {
        System.out.print("Nhap ten dương: ");
        street = sc.nextLine();
        System.out.print("Nhap thanh pho: ");
        city = sc.nextLine();
    }

    public void display() {
        System.out.println("Dia chi: " + street + ", " + city);
    }
}

class Student {
    String id, name;
    Address address = new Address(); // Khởi tạo đối tượng Address bên trong

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap MSV: ");
        id = sc.nextLine();
        System.out.print("Nhap ten SV: ");
        name = sc.nextLine();
        // Gọi input của Address
        address.input(sc);
    }

    public void display() {
        System.out.println("--- THONG TIN SINH VIEN ---");
        System.out.println("MSV: " + id + " | Ten: " + name);
        address.display();
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student sv = new Student();
        sv.input();
        sv.display();
    }
}