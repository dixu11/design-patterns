package composite;//leaf

public class Line extends Graphic {
    @Override
    public void draw() {
        System.out.println("Rysuje linie");
    }

    @Override
    public void add(Graphic component) {

    }

    @Override
    public void remove(Graphic component) {

    }

    @Override
    public Graphic getChild(int index) {
        return null;
    }
}
