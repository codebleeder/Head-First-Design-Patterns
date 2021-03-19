package pattern_11_state;

public class OrderedState implements State {

    public void next(Parcel parcel) {
        parcel.setState(new DeliveredState());
    }


    public void prev(Parcel parcel) {
        System.out.println("package is in root state");
    }


    public void printStatus() {
        System.out.println("package ordered");
    }
}
