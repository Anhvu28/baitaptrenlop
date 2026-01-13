import java.util.Scanner;
public class bai5 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số A: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số B: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Số lớn hơn là: " + a);
        } else if (b > a) {
            System.out.println("Số lớn hơn là: " + b);
        } else {
            System.out.println("Hai số bằng nhau.");
        }
    }
}
