package L18;

public class AdminUser extends User {

    public AdminUser (String username, String email) {
        super(username, email);
    }

    public void manageProducts () {
        System.out.println("Admin is managing products");
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("Aman Kumar", "aman@gmail.com");
        au.login();
    }
}
