class Report {
    protected String title;
    public Report(String t) { this.title = t; }
    public void generate() { System.out.println("Tao bao cao chung..."); }
}

class PDFReport extends Report {
    public PDFReport(String t) { super(t); }
    @Override 
    public void generate() { System.out.println("Xuat file PDF: " + title); }
}

class ExcelReport extends Report {
    public ExcelReport(String t) { super(t); }
    @Override 
    public void generate() { System.out.println("Xuat file Excel: " + title); }
}

class WordReport extends Report {
    public WordReport(String t) { super(t); }
    @Override 
    public void generate() { System.out.println("Xuat file Word: " + title); }
}
public class Bai2 {
    public static void main(String[] args) {
        Report r1 = new PDFReport("DoanhThu");
        Report r2 = new ExcelReport("NhanSu");
        Report r3 = new WordReport("TongHop");
        r1.generate();
        r2.generate();
        r3.generate();
    }

}