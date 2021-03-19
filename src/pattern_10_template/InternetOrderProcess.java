package pattern_10_template;

public class InternetOrderProcess extends OrderProcessTemplate{
    @Override
    public void deliverItem() {
        System.out.println("accept a delivery address");
        System.out.println("deliver item");
    }

    @Override
    public void makePayment() {
        System.out.println("accept order with credit/debit/net-banking/UPI");
        System.out.println("checkout successful");
    }

    @Override
    public void selectItem() {
        System.out.println("item added to cart");
        System.out.println("gift wrap option added");
    }
}
