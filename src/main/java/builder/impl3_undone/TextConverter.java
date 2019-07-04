package builder.impl3_undone;

public abstract class TextConverter {


    public abstract void convertCharacter(char character);

    public abstract void convertFontChange(String font);

    public abstract void convertParagraph();

    public abstract Text getConvertedText();

    // wewnętrzna klasa, dzięki takiemu rozwiązaniu mogą z niej korzystać konwertery a konstruktor jest ukryty przed userem
    class TextFileBuilder {
        // takie zbudowanie tej klasy to jedyny sposób na jaki wpadłem, żeby zrobić publiczny typ ale prywatny konstruktor

        private String builded = "";

        public void addNextPart(String text) {
            builded += text;
        }

        public Text getBuildedFile() {
            Text text = new Text(builded);
            builded = "";
            return text;
        }
    }

}
