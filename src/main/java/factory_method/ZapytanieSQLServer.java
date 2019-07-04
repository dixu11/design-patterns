package factory_method;

public class ZapytanieSQLServer extends SzablonZapytania {
    //konkretna implementacja kroków algorytmu

    protected String formatujConnect(String nazwaBD) {
        return nazwaBD;
    }

    protected String formatujSelect(String specZapyt) {
        return specZapyt;
    }

    @Override
    public BazaDanych utworzBD() {
        return new SQLServer();
    }
}
