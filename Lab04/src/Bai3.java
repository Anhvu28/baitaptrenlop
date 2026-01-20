class Book {
    String id;
    String title;
    double price;

    // Constructor không tham số (giá mặc định = 0)
    public Book() {
        this.price = 0;
    }

    // Constructor đầy đủ tham số
    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Sách: " + title + " (" + id + ") - Giá: " + price);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        // Tạo đối tượng 1: Constructor không tham số
        Book b1 = new Book();
        b1.id = "B01";
        b1.title = "Java Basic";
        
        // Tạo đối tượng 2: Constructor đầy đủ
        Book b2 = new Book("B02", "Java Advanced", 150000);

        b1.display();
        b2.display();
    }
}