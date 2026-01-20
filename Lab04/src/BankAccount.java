class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor để tiện khởi tạo (tùy chọn, có thể dùng setter)
    public BankAccount(String accNum, String name, double bal) {
        this.accountNumber = accNum;
        this.ownerName = name;
        this.balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công: " + amount);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rút thành công: " + amount);
        } else {
            System.out.println("Số dư không đủ để rút!");
        }
    }

    public void displayInfo() {
        System.out.println("TK: " + accountNumber + " | Chủ TK: " + ownerName + " | Số dư: " + balance);
    }
}