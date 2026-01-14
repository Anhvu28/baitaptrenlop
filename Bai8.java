import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String pass = sc.nextLine();

        if (pass.length() < 8) {
            System.out.println("Yếu: Độ dài phải >= 8 ký tự.");
            return;
        }

        boolean hasUpper = false; 
        boolean hasLower = false;
        boolean hasDigit = false; 
        boolean hasSpecial = false; 

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Mật khẩu MẠNH!");
        } else {
            System.out.println("Mật khẩu CHƯA ĐẠT yêu cầu.");
        }
    }
}