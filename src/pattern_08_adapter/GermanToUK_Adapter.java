package pattern_08_adapter;

public class GermanToUK_Adapter implements UK_Plug {
    private GermanPlug germanPlug;

    public GermanToUK_Adapter(GermanPlug germanPlug) {
        this.germanPlug = germanPlug;
    }

    public void provideElectricity() {
        germanPlug.giveElectricity();
    }
}
