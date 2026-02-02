class LoginMethod {
    protected String userId;
    public LoginMethod(String id) { this.userId = id; }
    public void login() { System.out.println("Dang nhap..."); }
}

class PasswordLogin extends LoginMethod {
    public PasswordLogin(String id) { super(id); }
    @Override 
    public void login() { System.out.println("Dang nhap bang Mat khau: " + userId); }
}

class GoogleLogin extends LoginMethod {
    public GoogleLogin(String id) { super(id); }
    @Override 
    public void login() { System.out.println("Dang nhap bang Google: " + userId); }
}

class FacebookLogin extends LoginMethod {
    public FacebookLogin(String id) { super(id); }
    @Override 
    public void login() { System.out.println("Redirect sang Facebook: " + userId); }
}
public class Bai3 {
    public static void main(String[] args) {
        new GoogleLogin("user1@gmail.com").login();
        new FacebookLogin("fb_user1_v3").login();
    }

}