package pattern_04_factory_method;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("email notification");
    }
}
