class Rectangle {
    double width;
    double height;

    // Không tham số -> 1x1
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // 1 tham số -> hình vuông
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    // 2 tham số -> hình chữ nhật
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("DT r1 (1x1): " + r1.getArea());
        System.out.println("DT r2 (Vuông 5): " + r2.getArea());
        System.out.println("DT r3 (CN 4x6): " + r3.getArea());
    }
}