package builder.impl3_undone;

public class Konfiguracja {
    private TextConverter actualTextConverter;

    public Konfiguracja() {
        setDefaultStrategy();
    }

    private void setDefaultStrategy() {
        actualTextConverter = new ASCIIConverter(false);
    }

    // wzorzec Strategia tworzy odpowiedni rodzaj konwersji w zależności od konfuguracji
    public void changeConvertingStrategy(ConversionType conversionType, RTFReader rtfReader) {
        switch (conversionType) {
            case ASCI:
                ASCIIConverter asciNonCapital = new ASCIIConverter(false);
                actualTextConverter = asciNonCapital;
                break;
            case ASCI_CAPITAL:
                ASCIIConverter asciCapital = new ASCIIConverter(true);
                actualTextConverter = asciCapital;
                break;
            case HTML_CAPITAL:
                actualTextConverter = new TeXConverter();
                break;
            case WIDGET:
                actualTextConverter = new TextWidgetConverter();
                break;
        }
        // zastosowałem sposób którego nauczyłem się przy obserwerze
        rtfReader.update();
    }


    public TextConverter getActualTextConverter() {
        return actualTextConverter;
    }
}
