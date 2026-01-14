import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần chuẩn hóa: ");
        String input = sc.nextLine();
        
        String[] words = input.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                String firstChar = word.substring(0, 1).toUpperCase();
                String remainChar = word.substring(1).toLowerCase();
                
                result.append(firstChar).append(remainChar).append(" ");
            }
        }

        System.out.println("Chuỗi chuẩn hóa: \"" + result.toString().trim() + "\"");
    }
}