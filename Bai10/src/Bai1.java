import javax.swing.*;
import java.awt.*;

public class Bai1 extends JFrame {

    public Bai1() {
        // 1. Thiết lập cửa sổ chính
        setTitle("Lê Văn A - TT601K14");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); // Kích thước tùy chọn để hiển thị đủ
        setLocationRelativeTo(null); // Căn giữa màn hình

        // 2. Tạo 3 JPanel
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        // Đặt kích thước ưu tiên để GroupLayout biết chiều cao mong muốn (100px)
        panel1.setPreferredSize(new Dimension(400, 100));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setPreferredSize(new Dimension(400, 100));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.setPreferredSize(new Dimension(400, 100));

        // 3. Bố cục giao diện dùng GroupLayout
        Container contentPane = getContentPane();
        GroupLayout layout = new GroupLayout(contentPane);
        contentPane.setLayout(layout);

        // Cấu hình tự động tạo khoảng cách (nếu cần)
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(false);

        // Nhóm theo chiều ngang (Horizontal): Các panel xếp song song và giãn hết chiều rộng
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(panel1)
                .addComponent(panel2)
                .addComponent(panel3)
        );

        // Nhóm theo chiều dọc (Vertical): Các panel xếp nối tiếp nhau (Sequential)
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Bai1().setVisible(true);
        });
    }
}