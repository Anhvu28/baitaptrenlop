import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        
        int originalN = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); 

        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, digits);
            n /= 10;
        }

        if (sum == originalN) {
            System.out.println(originalN + " là số Armstrong.");
        } else {
            System.out.println(originalN + " KHÔNG phải số Armstrong.");
        }
    }
}