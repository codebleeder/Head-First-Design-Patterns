package pattern_11_state;

public interface State {
   void next(Parcel parcel);
    void prev(Parcel parcel);
    void printStatus();
}
