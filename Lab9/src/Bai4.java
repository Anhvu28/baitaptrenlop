class ShippingService {
    protected double distance, weight;
    public ShippingService(double d, double w) { distance = d; weight = w; }
    public double calculateFee() { return 0; }
}

class StandardShipping extends ShippingService {
    public StandardShipping(double d, double w) { super(d, w); }
    @Override 
    public double calculateFee() { return distance * 1000 + weight * 500; }
}

class ExpressShipping extends ShippingService {
    public ExpressShipping(double d, double w) { super(d, w); }
    @Override 
    public double calculateFee() { return (distance * 1000 + weight * 500) * 1.5; }
}
public class Bai4 {
    public static void main(String[] args) {
        ShippingService s = new ExpressShipping(22, 7);
        System.out.println("Phi ship hoa toc: " + s.calculateFee());
        
    }

}