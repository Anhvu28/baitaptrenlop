interface Payable {
    double calculateSalary();
}

class FullTimeEmployee implements Payable {
    @Override public double calculateSalary() { return 2000.0; } // Lương cứng
    @Override public String toString() { return "FullTime"; }
}

class PartTimeEmployee implements Payable {
    private int hours;
    public PartTimeEmployee(int hours) { this.hours = hours; }
    @Override public double calculateSalary() { return hours * 20.0; } // Lương theo giờ
    @Override public String toString() { return "PartTime"; }
}

class Contractor implements Payable {
    @Override public double calculateSalary() { return 1500.0; } // Lương hợp đồng
    @Override public String toString() { return "Contractor"; }
}

