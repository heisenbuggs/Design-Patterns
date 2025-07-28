package FactoryPattern;

public class NotificationFactory {

    public static Notification createNotification(NotificationType type, String message) {
        if (type == null) {
            return null;
        }

        return switch (type) {
            case EMAIL -> new EmailNotification(message, "prasuk@gmail.com");
            case PUSH -> new PushNotification(message, "APN123456");
            case SMS -> new SMSNotification(message, "9872345123");
        };
    }
}
