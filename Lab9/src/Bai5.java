class Printer {
    protected String name;
    public Printer(String n) { name = n; }
    public void print() { System.out.println("Dang in..."); }
}

class LaserPrinter extends Printer {
    public LaserPrinter() { super("Laser"); }
    @Override 
    public void print() { System.out.println("In Laser sieu toc..."); }
}

class InkPrinter extends Printer {
    public InkPrinter() { super("Ink"); }
    @Override 
    public void print() { System.out.println("In phun mau..."); }
}
public class Bai5 {
    public static void main(String[] args) {
        new LaserPrinter().print();
        new InkPrinter().print();
    }

}