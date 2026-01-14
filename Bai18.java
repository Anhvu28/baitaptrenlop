import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông n: ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];

        System.out.println("Nhập các phần tử ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int sumChinh = 0;
        int sumPhu = 0;

        for (int i = 0; i < n; i++) {
            sumChinh += matrix[i][i];       
            sumPhu += matrix[i][n - 1 - i];   
        }

        System.out.println("Tổng đường chéo chính: " + sumChinh);
        System.out.println("Tổng đường chéo phụ: " + sumPhu);
    }
}