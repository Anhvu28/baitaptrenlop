import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Bai3 extends JFrame {

    public Bai3() {
        // 1. Cửa sổ chính
        setTitle("Lê Văn A - TT601K14");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        // Bố cục tổng thể: 3 hàng dọc -> Dùng GridLayout(3, 1)
        setLayout(new GridLayout(3, 1));

        // --- HÀNG TRÊN: Chứa Panel 1 ---
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Canh trái hoặc giữa tùy ý
        
        JPanel p1 = createStylePanel(new Color(173, 216, 230), "Panel 1"); // Xanh nhạt
        p1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        row1.add(p1);
        add(row1);

        // --- HÀNG GIỮA: Chứa Panel 7 (Panel 7 chứa Panel 2 và 3) ---
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        // Panel 7 là container
        JPanel p7 = new JPanel();
        p7.setLayout(new FlowLayout()); // Để chứa 2 panel con
        p7.setBorder(BorderFactory.createTitledBorder("Panel 7 (Container)"));
        
        JPanel p2 = createStylePanel(new Color(144, 238, 144), "Panel 2"); // Xanh lá nhạt
        p2.setBorder(BorderFactory.createEtchedBorder());
        
        JPanel p3 = createStylePanel(new Color(216, 191, 216), "Panel 3"); // Tím nhạt
        p3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        p7.add(p2);
        p7.add(p3);
        row2.add(p7);
        add(row2);

        // --- HÀNG DƯỚI: Chứa Panel 4, 5, 6 ---
        JPanel row3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        JPanel p4 = createStylePanel(new Color(255, 182, 193), "Panel 4"); // Đỏ nhạt/Hồng
        p4.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.RED));
        
        JPanel p5 = createStylePanel(Color.YELLOW, "Panel 5"); // Vàng
        p5.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        
        JPanel p6 = createStylePanel(new Color(0, 255, 255), "Panel 6"); // Xanh ngọc
        p6.setBorder(BorderFactory.createTitledBorder("TitledBorder"));
        
        row3.add(p4);
        row3.add(p5);
        row3.add(p6);
        add(row3);
    }

    // Hàm tạo Panel với kích thước cố định 100x100 và màu nền
    private JPanel createStylePanel(Color bg, String text) {
        JPanel p = new JPanel();
        p.setBackground(bg);
        p.setPreferredSize(new Dimension(100, 100));
        // Thêm label để dễ nhận biết (tùy chọn)
        // p.add(new JLabel(text)); 
        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Bai3().setVisible(true);
        });
    }
}