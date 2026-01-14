import java.util.ArrayList;

public class Bai17 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        ArrayList<Integer> chan = new ArrayList<>();
        ArrayList<Integer> le = new ArrayList<>();

        for (int x : arr) {
            if (x % 2 == 0) {
                chan.add(x);
            } else {
                le.add(x);  
            }
        }

        System.out.println("Mảng chẵn: " + chan);
        System.out.println("Mảng lẻ: " + le);
    }
}