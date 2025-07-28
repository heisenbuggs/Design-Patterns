import FactoryPattern.Notification;
import FactoryPattern.NotificationFactory;
import FactoryPattern.NotificationType;


public class FactoryPatternTest {
    public static void main(String[] args) {
        Notification emailNotification = NotificationFactory.createNotification(
            NotificationType.EMAIL, "Hello, this is an email notification!");

        Notification smsNotification = NotificationFactory.createNotification(
            NotificationType.SMS, "Hello, this is an SMS notification!");

        Notification pushNotification = NotificationFactory.createNotification(
            NotificationType.PUSH, "Hello, this is a push notification!");

        emailNotification.notifyUser();
        smsNotification.notifyUser();
        pushNotification.notifyUser();
    }
}
