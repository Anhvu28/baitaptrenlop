import java.util.Scanner;
public class bai3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số CHẴN.");
        } else {
            System.out.println(n + " là số LẺ.");
        }
    }
    
}
