public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void send(User user, String message) {
        System.out.println("Sending Push Notification to " + user.getEmail() + ": " + message);
    }
}


