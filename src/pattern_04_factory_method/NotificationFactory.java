package pattern_04_factory_method;

public class NotificationFactory {
    public static Notification createNotification(NotificationType type) {
        switch (type) {
            case SMS: return new SMS_Notification();
            case EMAIL: return new EmailNotification();
            case PUSH: return new PushNotification();
        }
        return null;
    }
}
