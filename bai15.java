import java.util.Scanner;
class SinhVien {
    String ten;
    double diem;
}

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        
        SinhVien[] danhSach = new SinhVien[n];
        
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); 
            danhSach[i] = new SinhVien();
            
            System.out.println("Nhập thông tin SV thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            danhSach[i].ten = scanner.nextLine();
            System.out.print("Điểm: ");
            danhSach[i].diem = scanner.nextDouble();
        }
        double tongDiem = 0;
        double diemMax = -1;
        String tenMax = "";

        System.out.println("\n--- KẾT QUẢ XẾP LOẠI ---");
        for (SinhVien sv : danhSach) {
            tongDiem += sv.diem;

            if (sv.diem > diemMax) {
                diemMax = sv.diem;
                tenMax = sv.ten;
            }

            String xepLoai;
            if (sv.diem >= 8.0) xepLoai = "Giỏi";
            else if (sv.diem >= 6.5) xepLoai = "Khá";
            else if (sv.diem >= 5.0) xepLoai = "Trung bình";
            else xepLoai = "Yếu";

            System.out.println(sv.ten + " - " + sv.diem + " điểm - Xếp loại: " + xepLoai);
        }

        System.out.println("\n-----------------------------");
        System.out.println("Điểm trung bình cả lớp: " + (tongDiem / n));
        System.out.println("Sinh viên điểm cao nhất: " + tenMax + " (" + diemMax + ")");
    }
}