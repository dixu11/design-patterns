package composite;

public abstract class Graphic {
    public  abstract void draw();

    /* ta konstrukcja programu ma wadę, klasy które są ostatnim odnogami drzewa nie powinny mieć metod takich
     jak add/remove czy getChild. możnaby było uniknąć używania niepotrzebnych metod tworząc całe drzewo gotowe
     przez konstruktor lub podobnie jak biblioteka String przy każdej zmianie tworzyć nowy obiekt, w którym
     ostatnia odnoga jest już typu composite.Graphic */
    public abstract void add(Graphic component);

    public abstract void remove(Graphic component);

    public abstract Graphic getChild (int index);

}
