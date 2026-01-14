import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int[] counter = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counter[c]++; 
        }

        System.out.println("Tần suất xuất hiện:");
        for (int i = 0; i < 256; i++) {
            if (counter[i] > 0) {
                System.out.println("'" + (char)i + "': " + counter[i]);
            }
        }
    }
}