import java.util.HashSet;
import java.util.Set;

public class Bai7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        Set<Integer> set = new HashSet<>();

        for (int x : arr1) set.add(x);
        
        for (int x : arr2) set.add(x);

        System.out.println("Mảng sau khi gộp và loại trùng:");
        for (int item : set) {
            System.out.print(item + " ");
        }
    }
}