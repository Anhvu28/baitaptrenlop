public class Bai9 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 2, 9};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Mảng sau khi sắp xếp: ");
        for (int x : arr) System.out.print(x + " ");
    }
}