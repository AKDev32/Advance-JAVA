package Inheritance.Example1;

public class AdminUser extends User {

    public AdminUser (String username, String email) {
        super(username, email);
    }

    public void manageProducts () {
        System.out.println("Admin is managing products");
    }

    public void updateProducts () {
        System.out.println(username + "'s username needs to be updated");
    }

    @Override
    public void showDashBoard() {
        super.showDashBoard();
        System.out.println("Admin user personalised dashBoard");
    }


    public static void main(String[] args) {
        AdminUser au = new AdminUser("Aman Kumar", "aman@gmail.com");
        au.login();
        au.showDashBoard();

    }
}
