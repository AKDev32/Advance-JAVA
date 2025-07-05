package L18;

public class User {

    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void login () {
        System.out.println(username + "logged in");
    }
}
