import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt(); // Nhập số a

        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt(); // Nhập số b

        int tong = a + b;
        System.out.println("Tong hai so la: " + tong);
    }
    
}
