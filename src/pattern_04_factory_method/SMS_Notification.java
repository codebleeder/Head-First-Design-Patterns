package pattern_04_factory_method;

public class SMS_Notification implements Notification {
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}
