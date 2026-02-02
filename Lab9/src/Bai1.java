class Account {
    protected String username;
    public Account(String u) { this.username = u; }
    public String getRole() { return "USER"; }
}

class AdminAccount extends Account {
    public AdminAccount(String u) { super(u); }
    @Override 
    public String getRole() { return "ADMIN"; }
}

class StudentAccount extends Account {
    public StudentAccount(String u) { super(u); }
    @Override 
    public String getRole() { return "STUDENT"; }
}

class GuestAccount extends Account {
    public GuestAccount(String u) { super(u); }
    @Override 
    public String getRole() { return "GUEST"; }
}
public class Bai1 {
    public static void main(String[] args) {
        Account[] list = { 
            new AdminAccount("admin"), 
            new StudentAccount("sv_01"),
            new GuestAccount("khach")
        };
        
        for (Account acc : list) {
            System.out.println("User: " + acc.username + " - Role: " + acc.getRole());
        }
    }
    
}