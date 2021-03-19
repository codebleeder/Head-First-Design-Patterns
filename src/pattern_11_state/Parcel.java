package pattern_11_state;

public class Parcel {
    private State state = new OrderedState();

    public void previousState(){
        state.prev(this);
    }

    public void nextState(){
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }

    public void setState(State state) {
        this.state = state;
    }
}
