interface ShapeEx4 {
    double calculateArea();

    // Static method: Gọi trực tiếp từ tên Interface
    static String getInfo() {
        return "This is a shape";
    }
}

class Square implements ShapeEx4 {
    double side;
    public Square(double side) { this.side = side; }

    @Override
    public double calculateArea() { return side * side; }
}

