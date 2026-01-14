public class Bai4 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        long maxSum = Integer.MIN_VALUE; 
        long currentSum = 0;            

        for (int num : arr) {
            currentSum += num;
            
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        System.out.println("Tổng mảng con lớn nhất là: " + maxSum);
    }
}