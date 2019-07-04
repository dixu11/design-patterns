package composite;//composer

import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic {
    private List<Graphic> childs;

    public Picture() {
        this.childs = new ArrayList<>();
    }


   // metoda draw w tym przypadku jedynie odpala wszystkie metody draw kolejnych obiektów
    // nic nie stoi na przeszkodzie, żeby sama też coś dorysowywała, np ramkę obrazka
    public void draw() {
        for (Graphic child : childs) {
            child.draw();
        }
    }

    @Override
    public void add(Graphic component) {
        childs.add(component);
    }

    @Override
    public void remove(Graphic component) {
        childs.remove(component);
    }

    @Override
    public Graphic getChild(int index) {
    return childs.contains(index) ? childs.get(index) : null;
    // zdaję sobie sprawę, że zwracanie nulla jest nie wskazane, można zastąpić go optionalem lub rzucić wyjątek
    }
}
