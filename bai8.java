import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bảng cửu chương muốn in (1-9): ");
        int n = scanner.nextInt();

        System.out.println("Bảng cửu chương " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    
}
