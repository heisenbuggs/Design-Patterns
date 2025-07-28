package FactoryPattern;

public class SMSNotification implements Notification {

    private String message;
    private String phoneNumber;

    public SMSNotification(String message, String phoneNumber) {
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification: \"" + message + "\" to phone number: " + phoneNumber);
    }
}
