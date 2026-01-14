public class Bai11 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8, 11, 13, 20};
        
        System.out.print("Các số nguyên tố trong mảng: ");
        int count = 0;
        
        for (int x : arr) {
            if (isPrime(x)) {
                System.out.print(x + " ");
                count++;
            }
        }
        
        System.out.println("\nTổng cộng có: " + count + " số nguyên tố.");
    }
}