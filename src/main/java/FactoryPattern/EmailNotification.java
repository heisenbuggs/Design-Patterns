package FactoryPattern;

public class EmailNotification implements Notification {
    private String message;
    private String emailAddress;

    public EmailNotification(String message, String emailAddress) {
        this.message = message;
        this.emailAddress = emailAddress;
    }

    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification:  \"" + message + "\" to email: " + emailAddress);
    }
}
