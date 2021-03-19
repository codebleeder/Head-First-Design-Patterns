package pattern_10_template;

public abstract class OrderProcessTemplate {
    private boolean isGift;

    public void processOrder(){
        selectItem();
        makePayment();

        if (isGift) {
            giftWrap();
        }
        deliverItem();
    }

    public abstract void deliverItem();

    private void giftWrap() {
        System.out.println("gift wrap success");
    }

    public abstract void makePayment();

    public abstract void selectItem();
}
