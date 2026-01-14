public class Bai12 {
    public static void main(String[] args) {
        int[] arr = {123, 45, 9, 2024};

        for (int x : arr) {
            int original = x; 
            int sum = 0;
            
            while (x > 0) {
                sum += x % 10; 
                x = x / 10;   
            }
            
            System.out.println("Số " + original + " -> Tổng chữ số: " + sum);
        }
    }
}