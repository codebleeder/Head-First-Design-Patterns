package pattern_11_state;

public class ReceivedState implements State {

    public void next(Parcel parcel) {
        System.out.println("package already received");
    }


    public void prev(Parcel parcel) {
        parcel.setState(new DeliveredState());
    }


    public void printStatus() {
        System.out.println("package received");
    }
}
