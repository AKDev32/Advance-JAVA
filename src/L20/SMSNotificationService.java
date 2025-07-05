package L20;

public class SMSNotificationService implements NotificationService {

    private String phoneNumber;

    public SMSNotificationService (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending notification to " + phoneNumber);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribe " + phoneNumber + " to email notification for topic" + topic);
    }
}
