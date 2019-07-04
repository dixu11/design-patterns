package builder.impl3_undone;

public class TextWidgetConverter extends TextConverter {
    private Text tekst = new Text("");
    private TextFileBuilder textFileBuilder = new TextFileBuilder();
    private boolean fontOn = false;

    @Override
    public void convertCharacter(char character) {
        textFileBuilder.addNextPart(Character.toString(character));
        if (fontOn) {
            textFileBuilder.addNextPart("}");
        }
        fontOn = false;
    }

    @Override
    public void convertFontChange(String font) {
        textFileBuilder.addNextPart("{"+ font.charAt(1) +"#"); // przekształcenie html
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
