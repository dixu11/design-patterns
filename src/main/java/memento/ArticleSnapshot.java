package memento;


public class ArticleSnapshot {

    private final String text;
    private final Color color;
    private  final int fontSize;

    public ArticleSnapshot(String text, Color color, int fontSize) {
        this.text = text;
        this.color = color;
        this.fontSize = fontSize;
    }



    //GS
    public String getText() {
        return text;
    }

    public Color getColor() {
        return color;
    }

    public int getFontSize() {
        return fontSize;
    }
}
