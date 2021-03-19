package pattern_04_factory_method;

class Main {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification(NotificationType.SMS);
        smsNotification.notifyUser();

        Notification emailNotification = NotificationFactory.createNotification(NotificationType.EMAIL);
        emailNotification.notifyUser();

        Notification pushNotification = NotificationFactory.createNotification(NotificationType.PUSH);
        pushNotification.notifyUser();
    }
}
