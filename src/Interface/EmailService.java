package Interface;

public class EmailService implements NotificationService {

    private String email;

    public EmailService (String email) {
        this.email = email;
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending email notification to " + email);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribed " + email + " to email notifications for topic : " + topic);
    }
}
