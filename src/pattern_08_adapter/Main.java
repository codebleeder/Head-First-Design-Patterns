package pattern_08_adapter;

public class Main {
    public static void main(String[] args) {
        GermanPlug germanPlug = new GermanPlug() {
            public void giveElectricity() {
                System.out.println("german plug give electricity");
            }
        };

        UK_Plug ukPlug = new UK_Plug() {
            public void provideElectricity() {
                System.out.println("uk plug provide electricity");
            }
        };

        GermanToUK_Adapter adapter = new GermanToUK_Adapter(germanPlug);
        UK_Socket ukSocket = new UK_Socket();
        ukSocket.plugIn(adapter);

    }
}
