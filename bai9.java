import java.util.Scanner;
public class bai9 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();
        int originalN = n;

        int count = 0;
        if (n == 0) count = 1; 

        while (n > 0) {
            n = n / 10; 
            count++;
        }

        System.out.println("Số " + originalN + " có " + count + " chữ số.");
    }
    
}
