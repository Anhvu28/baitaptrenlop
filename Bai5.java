import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        String cleanStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        String reversed = new StringBuilder(cleanStr).reverse().toString();

        if (cleanStr.equals(reversed)) {
            System.out.println("Là chuỗi Palindrome!");
        } else {
            System.out.println("Không phải Palindrome.");
        }
    }
}