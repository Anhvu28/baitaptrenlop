public class Bai10 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 20, 8, 15}; 

        if (arr.length < 2) {
            System.out.println("Mảng không đủ phần tử.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {

                secondMax = x;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ hai (các số bằng nhau).");
        } else {
            System.out.println("Số lớn nhất: " + max);
            System.out.println("Số lớn thứ hai: " + secondMax);
        }
    }
}