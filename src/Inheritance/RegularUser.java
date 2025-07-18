package Inheritance;

public class RegularUser extends User {

    public RegularUser (String username, String email) {
        super(username, email);
    }

    public void  browserProducts () {
        System.out.println("Customers is browsing products");
    }

    @Override
    public void showDashBoard() {
        System.out.println("Regular user personalised dashboard");
    }
}
