import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder(text);
        System.out.println("Chuỗi đảo ngược: " + sb.reverse().toString());
    }
    
}
