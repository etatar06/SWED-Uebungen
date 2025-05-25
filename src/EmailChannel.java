public class EmailChannel implements NotificationChannel {
    @Override
    public void send(User user, String message) {
        System.out.println("Sending Email to " + user.getEmail() + ": " + message);
    }
}

