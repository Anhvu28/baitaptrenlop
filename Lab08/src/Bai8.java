public class Bai8 {
    // Phương thức nhận tham số là Interface
    public static void paySalary(Payable p) {
        System.out.println("Paying salary for " + p.toString() + ": $" + p.calculateSalary());
    }

    public static void main(String[] args) {
        paySalary(new FullTimeEmployee());
        paySalary(new PartTimeEmployee(50));
        paySalary(new Contractor());
    }
}