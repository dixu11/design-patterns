package builder.impl3_undone;

public class ASCIIConverter extends TextConverter {
    private boolean capitalConversion; // czy chcemy wersje zmieniającą wielkość znaków?
    private Text tekst = new Text(""); // pole na zbudowany obiekt
    private TextFileBuilder textFileBuilder = new TextFileBuilder(); // pole na builder z wewnętrznej klasy
    private boolean fontOn = false; // czy mamy zaraz doczepić drugą stronę fonta?

    public ASCIIConverter(boolean capitalConversion) {
        this.capitalConversion = capitalConversion;
    }

    public void convertCharacter(char character) {
        if (capitalConversion) {
            if (fontOn) {
                textFileBuilder.addNextPart(Character.toString(Character.toUpperCase(character)));
                fontOn = false;
            } else {
                textFileBuilder.addNextPart(Character.toString(character));
            }
        } else {
            textFileBuilder.addNextPart(Character.toString(character));
        }
    }

    @Override
    public void convertFontChange(String font) {
        fontOn = true; // zmiana aby metoda z Charem wiedziała czy ma dać dużą literę
    }

    @Override
    public void convertParagraph() {
        textFileBuilder.addNextPart("\n");
    }

    @Override
    public Text getConvertedText() {
        return textFileBuilder.getBuildedFile();  // metoda do wywołania na zakończenie konstrukcji
    }
}


