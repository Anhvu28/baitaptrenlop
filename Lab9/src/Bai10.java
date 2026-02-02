interface CoTheBay {
    void bay();
}

abstract class DongVat {
    protected String ten;
    public DongVat(String t) { ten = t; }
    public abstract void keu();
}

class Cho extends DongVat {
    public Cho() { super("Cho"); }
    @Override public void keu() { System.out.println("Gau gau"); }
}

class Chim extends DongVat implements CoTheBay {
    public Chim() { super("Chim"); }
    @Override public void keu() { System.out.println("Chip chip"); }
    @Override public void bay() { System.out.println("Chim dang bay..."); }
}
public class Bai10 {
    public static void main(String[] args) {
        DongVat[] ds = { new Cho(), new Chim() };
        
        for (DongVat dv : ds) {
            System.out.print(dv.ten + ": ");
            dv.keu();
            
            if (dv instanceof CoTheBay) {
                ((CoTheBay) dv).bay();
            }
        }
    }

}