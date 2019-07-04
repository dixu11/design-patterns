package memento;


public class Article {
    private String text;
    private Color color;
    private int fontSize;

    public Article(String text, Color color, int fontSize) {
        this.text = text;
        this.color = color;
        this.fontSize = fontSize;
    }

    public void restore(ArticleSnapshot snapshot){
        text = snapshot.getText();
        color = snapshot.getColor();
        fontSize = snapshot.getFontSize();
    }


    @Override
    public String toString() {
        return String.format("%s text size %d: %s",color,fontSize,text);
    }

    //GS
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}



