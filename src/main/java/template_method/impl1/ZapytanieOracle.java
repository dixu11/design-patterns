package template_method.impl1;

public class ZapytanieOracle extends SzablonZapytania {
    protected String formatujConnect(String nazwaBD) {
        return nazwaBD;
    }

    protected String formatujSelect(String specZapyt) {
        return specZapyt + ";";
    }
}
