import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Số từ: 0");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Số từ có trong chuỗi: " + words.length);
        }
    }
}