package builder.impl3_undone;

public class TeXConverter extends TextConverter {
    private Text tekst = new Text("");
    private TextFileBuilder textFileBuilder = new TextFileBuilder();
    private boolean fontOn = false;
    private String endingFont;

// zmiana wielkości liter jak przy ASCI
    public void convertCharacter(char character) {
        if (fontOn) {
            textFileBuilder.addNextPart(Character.toString(Character.toUpperCase(character)));
            textFileBuilder.addNextPart(endingFont); // doklejam drugą stronę html jeśli pole fontOn informuje ze był font
        } else {
            textFileBuilder.addNextPart(Character.toString(character));
        }
        fontOn = false;
    }

    @Override
    public void convertFontChange(String font) {
        textFileBuilder.addNextPart(font);
        endingFont = "</" + font.substring(1); // przygotowuję zakończenie fonta dla metody która przyjmie litere
        fontOn = true;
    }

    @Override
    public void convertParagraph() {
        textFileBuilder.addNextPart("\n");
    }

    @Override
    public Text getConvertedText() {
        return textFileBuilder.getBuildedFile();
    }
}
