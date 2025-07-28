package FactoryPattern;

public class PushNotification implements Notification {

    private String message;
    private String deviceToken;

    public PushNotification(String message, String deviceToken) {
        this.message = message;
        this.deviceToken = deviceToken;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification to the user: \"" + message + "\" to device token: " + deviceToken);
    }
}
