import java.util.HashMap;
import java.util.Map;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 9, 3, 1, 3, 5};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int soXuatHienNhieuNhat = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                soXuatHienNhieuNhat = entry.getKey();
            }
        }

        System.out.println("Số " + soXuatHienNhieuNhat + " xuất hiện nhiều nhất (" + maxCount + " lần).");
    }
}