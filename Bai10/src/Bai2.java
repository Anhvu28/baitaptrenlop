import javax.swing.*;
import java.awt.*;

public class Bai2 extends JFrame {

    public Bai2() {
        // 1. Cửa sổ chính
        setTitle("Lê Văn A - TT601K14");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Sử dụng BorderLayout cho bố cục tổng thể
        setLayout(new BorderLayout());

        // --- HÀNG TRÊN (NORTH) ---
        // Chứa 4 panel xếp ngang -> Dùng GridLayout(1 dòng, 4 cột)
        JPanel topPanel = new JPanel(new GridLayout(1, 4));
        
        JPanel p1 = createPanel(Color.YELLOW);
        JPanel p2 = createPanel(Color.PINK);
        JPanel p3 = createPanel(new Color(0, 128, 128)); // Xanh cổ vịt (giống hình)
        JPanel p4 = createPanel(new Color(20, 50, 50));  // Màu tối (giống hình)
        
        topPanel.add(p1);
        topPanel.add(p2);
        topPanel.add(p3);
        topPanel.add(p4);
        
        // Đặt chiều cao cho hàng trên (tùy chọn để đẹp hơn)
        topPanel.setPreferredSize(new Dimension(0, 100));
        add(topPanel, BorderLayout.NORTH);

        // --- HÀNG GIỮA (CENTER) ---
        // Chia làm 2 khu vực trái phải -> Dùng GridLayout(1 dòng, 2 cột)
        JPanel centerPanel = new JPanel(new GridLayout(1, 2));
        
        JPanel p5 = createPanel(Color.GREEN);
        JPanel p6 = createPanel(Color.RED);
        
        centerPanel.add(p5);
        centerPanel.add(p6);
        add(centerPanel, BorderLayout.CENTER);

        // --- HÀNG DƯỚI (SOUTH) ---
        // 1 Panel chiếm toàn bộ chiều ngang
        JPanel p7 = createPanel(Color.BLUE);
        p7.setPreferredSize(new Dimension(0, 100)); // Chiều cao hàng dưới
        add(p7, BorderLayout.SOUTH);
    }

    // Hàm phụ trợ để tạo Panel nhanh với màu nền
    private JPanel createPanel(Color color) {
        JPanel p = new JPanel();
        p.setBackground(color);
        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Bai2().setVisible(true);
        });
    }
}