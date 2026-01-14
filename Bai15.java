public class Bai15 {
    public static void main(String[] args) {
        String input = "Lap trinh Java";
        
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Chuỗi kết quả: " + result.toString().trim());
    }
}