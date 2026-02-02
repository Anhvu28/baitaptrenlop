@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Bai7 {
    public static void main(String[] args) {
        // Cộng
        Calculator add = (a, b) -> a + b;
        
        // Trừ
        Calculator sub = (a, b) -> a - b;
        
        // Nhân
        Calculator mul = (a, b) -> a * b;

        System.out.println("10 + 5 = " + add.operate(10, 5));
        System.out.println("10 - 5 = " + sub.operate(10, 5));
        System.out.println("10 * 5 = " + mul.operate(10, 5));
    }
}