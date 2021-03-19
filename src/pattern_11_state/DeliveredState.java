package pattern_11_state;

public class DeliveredState implements State {

    public void next(Parcel parcel) {
        parcel.setState(new ReceivedState());
    }

    public void prev(Parcel parcel) {
        parcel.setState(new OrderedState());
    }

    public void printStatus() {
        System.out.println("package delivered");
    }
}
