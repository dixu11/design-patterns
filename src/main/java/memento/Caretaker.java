package memento;

import java.util.Optional;
import java.util.Stack;

public class Caretaker {
    private Stack<ArticleSnapshot> snapshots = new Stack<>();

    public void saveState(Article article) {
        snapshots.push(createSnapshot(article));
    }

    private Optional<ArticleSnapshot> popLastSnapshot() {
        if (snapshots.empty()) {
            return Optional.empty();
        } else {
            return Optional.of(snapshots.pop());
        }


    }

    public boolean reverseState(Article article) {
        Optional<ArticleSnapshot> snapshot = popLastSnapshot();
       snapshot.ifPresent(article::restore);
        return snapshot.isPresent();
    }

    private ArticleSnapshot createSnapshot(Article article) {
        return new ArticleSnapshot(article.getText(), article.getColor(), article.getFontSize());
    }
    

}
