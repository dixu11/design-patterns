package memento;


public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Article article = new Article("Wiadomości sporotwe...", Color.GREEN, 16);

        caretaker.saveState(article);
        article.setColor(Color.BLACK);
        article.setFontSize(20);
        article.setText("Zamach w Londynie!");

        caretaker.saveState(article);
        article.setText("Prezydent przyjezdza do Szczecina!");

        caretaker.saveState(article);

        caretaker.reverseState(article);
        System.out.println(article);

        caretaker.reverseState(article);
        System.out.println(article);

        caretaker.reverseState(article);
        System.out.println(article);

        caretaker.reverseState(article);
        System.out.println(article);

        caretaker.reverseState(article);
        System.out.println(article);
    }
}
