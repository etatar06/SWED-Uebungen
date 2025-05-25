public class SMSChannel implements NotificationChannel {
    @Override
    public void send(User user, String message) {
        System.out.println("Sending SMS to " + user.getEmail() + ": " + message);
    }
}


