package pattern_10_template;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate internetOrder = new InternetOrderProcess();
        internetOrder.processOrder();
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrderProcess();
        storeOrder.processOrder();
    }
}
