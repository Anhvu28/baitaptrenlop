class SystemAlert {
    protected String msg;
    public SystemAlert(String m) { msg = m; }
    public void show() { System.out.println(msg); }
}

class WarningAlert extends SystemAlert {
    public WarningAlert(String m) { super(m); }
    @Override 
    public void show() { System.out.println("[WARNING] " + msg); }
}

class ErrorAlert extends SystemAlert {
    public ErrorAlert(String m) { super(m); }
    @Override 
    public void show() { System.out.println("[ERROR] " + msg); }
}
public class Bai6 {
    public static void main(String[] args) {
        new WarningAlert("Pin yeu").show();
        new ErrorAlert("Loi ket noi mang").show();
    }

}