package L18;

public class SellerUser extends User {

    public SellerUser (String username, String email) {

        super(username, email);
    }

    public void addProducts () {
        System.out.println("Seller is adding a new product");
    }

    @Override
    public void showDashBoard() {
        System.out.println("Seller user personalised dashBoard");
    }
}
