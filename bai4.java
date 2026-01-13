import java.util.Scanner;
public class bai4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble(); // Dùng double vì chiều dài có thể là số lẻ

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
    }
    
}
