package pattern_11_state;

class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.printStatus();

        parcel.nextState();
        parcel.printStatus();

        parcel.nextState();
        parcel.printStatus();
    }
}
