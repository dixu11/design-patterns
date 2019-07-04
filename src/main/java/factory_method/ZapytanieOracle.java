package factory_method;

public class ZapytanieOracle extends SzablonZapytania {
    protected String formatujConnect(String nazwaBD) {
        return nazwaBD;
    }

    protected String formatujSelect(String specZapyt) {
        return specZapyt + ";";
    }

    @Override
    public BazaDanych utworzBD() {
        return new Oracle();
    }
}
