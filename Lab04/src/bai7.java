class Address {
    String street;
    String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class StudentWithAddress {
    String name;
    Address address; // Kết tập

    public StudentWithAddress(String id, String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("SV: " + name + " - Đ/c: " + address.street + ", " + address.city);
    }
}

public class bai7 {
    public static void main(String[] args) {
        Address addr = new Address("123 Xuan Thuy", "Ha Noi");
        StudentWithAddress sv = new StudentWithAddress("SV007", "James Bond", addr);
        
        sv.display();
    }
}