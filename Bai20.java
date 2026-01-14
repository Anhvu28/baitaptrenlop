import java.util.Scanner;
import java.util.Random; 

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int targetNumber = rand.nextInt(100) + 1; 
        int maxLuotChoi = 7;
        boolean isWin = false;

        System.out.println("Chào mừng đến với game Đoán Số!");
        System.out.println("Tôi đã nghĩ ra 1 số từ 1-100. Bạn có " + maxLuotChoi + " lượt đoán.");

        for (int i = 1; i <= maxLuotChoi; i++) {
            System.out.print("Lượt " + i + ": Bạn đoán số mấy? ");
            int guess = sc.nextInt();

            if (guess == targetNumber) {
                System.out.println("CHÚC MỪNG! Bạn đoán đúng rồi!");
                isWin = true;
                break; 
            } else if (guess < targetNumber) {
                System.out.println("-> Số bí mật LỚN hơn số của bạn.");
            } else {
                System.out.println("-> Số bí mật NHỎ hơn số của bạn.");
            }
        }

        if (!isWin) {
            System.out.println("Rất tiếc, bạn đã hết lượt. Số bí mật là: " + targetNumber);
        }
    }
}