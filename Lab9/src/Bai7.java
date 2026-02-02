abstract class NhanVien {
    protected String maNV, tenNV;
    public NhanVien(String ma, String ten) { this.maNV = ma; this.tenNV = ten; }
    public abstract double tinhLuong();
    public void hienThi() {
        System.out.println(tenNV + " (" + maNV + ") - Luong: " + tinhLuong());
    }
}

class NhanVienFullTime extends NhanVien {
    private double luongCB, thuong;
    public NhanVienFullTime(String m, String t, double l, double th) {
        super(m, t); luongCB = l; thuong = th;
    }
    @Override 
    public double tinhLuong() { return luongCB + thuong; }
}

class NhanVienPartTime extends NhanVien {
    private int gio; private double luongGio;
    public NhanVienPartTime(String m, String t, int g, double lg) {
        super(m, t); gio = g; luongGio = lg;
    }
    @Override 
    public double tinhLuong() { return gio * luongGio; }
}
public class Bai7 {
    public static void main(String[] args) {
        NhanVien[] ds = {
            new NhanVienFullTime("FT01", "Tuan",120000,6000),
            new NhanVienPartTime("PT01", "Nam", 500, 20)
        };
        for (NhanVien nv : ds) nv.hienThi();
    }

}