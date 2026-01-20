public class Mainbai2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456", "Tran Van B", 1000000);
        acc.displayInfo();
        
        acc.deposit(500000);
        acc.displayInfo();

        acc.withdraw(2000000); // Thử rút quá số dư
        acc.withdraw(200000);  // Rút hợp lệ
        acc.displayInfo();
    }
}