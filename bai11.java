import java.util.Scanner;
public class bai11 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập mảng
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int tong = 0;
        for (int x : arr) { 
            tong += x;
        }

        System.out.println("Tổng các phần tử trong mảng là: " + tong);
    }
    
}
