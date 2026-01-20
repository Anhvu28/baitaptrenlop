class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Add int 2 số: " + calc.add(5, 10));
        System.out.println("Add double: " + calc.add(5.5, 2.3));
        System.out.println("Add int 3 số: " + calc.add(1, 2, 3));
    }
}