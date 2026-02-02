public class Bai4 {
    public static void main(String[] args) {
        // Gọi static method từ Interface, không cần tạo đối tượng
        System.out.println(ShapeEx4.getInfo());
        
        Square sq = new Square(4);
        System.out.println("Area: " + sq.calculateArea());
    }
}