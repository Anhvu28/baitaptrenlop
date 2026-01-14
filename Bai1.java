import java.util.Scanner;

class Student {
    String id;
    String name;
    double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        Student[] list = new Student[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã SV: "); String id = sc.nextLine();
            System.out.print("Tên: ");   String name = sc.nextLine();
            System.out.print("Điểm: ");  double score = sc.nextDouble();
            
            list[i] = new Student(id, name, score);
        }

        double sum = 0;
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.printf("%-10s %-20s %-10s %-10s\n", "Mã", "Tên", "Điểm", "Kết quả");
        
        for (Student s : list) {
            sum += s.score;
            String status = (s.score >= 5.0) ? "Đạt" : "Trượt";
            System.out.printf("%-10s %-20s %-10.1f %-10s\n", s.id, s.name, s.score, status);
        }

        System.out.println("\nĐiểm trung bình cả lớp: " + (sum / n));
    }
}