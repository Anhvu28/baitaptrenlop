interface ThanhToan {
    double thanhToan(double soTien);
}

abstract class PhuongThucThanhToan {
    protected String tenPT;
    public abstract double phiGiaoDich(double soTien);
    public void hienThi() { System.out.println("PT: " + tenPT); }
}

class ThanhToanTienMat extends PhuongThucThanhToan implements ThanhToan {
    public ThanhToanTienMat() { this.tenPT = "Tien Mat"; }
    @Override 
    public double phiGiaoDich(double t) { return 0; }
    @Override 
    public double thanhToan(double t) { return t + phiGiaoDich(t); }
}

class ThanhToanThe extends PhuongThucThanhToan implements ThanhToan {
    public ThanhToanThe() { this.tenPT = "The Tin Dung"; }
    @Override 
    public double phiGiaoDich(double t) { return t * 0.02; }
    @Override 
    public double thanhToan(double t) { return t + phiGiaoDich(t); }
}
public class Bai8 {
    public static void main(String[] args) {
        ThanhToan t1 = new ThanhToanTienMat();
        ThanhToan t2 = new ThanhToanThe();
        
        System.out.println("Tien mat (100k): " + t1.thanhToan(220000));
        System.out.println("The (100k + 2%): " + t2.thanhToan(200000));
    }

}