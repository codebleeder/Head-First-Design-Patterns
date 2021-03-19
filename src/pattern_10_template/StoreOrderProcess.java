package pattern_10_template;

public class StoreOrderProcess extends OrderProcessTemplate{
    @Override
    public void deliverItem() {
        System.out.println("print bill");
        System.out.println("deliver item");
    }

    @Override
    public void makePayment() {
        System.out.println("accept order with cash/UPI");
        System.out.println("checkout successful");
    }

    @Override
    public void selectItem() {
        System.out.println("select item from shelf");
        System.out.println("gift wrap option added");
    }
}
