package composite;

//leaf
public class Rectangle extends Graphic {
    @Override
    public void draw() {
        System.out.println("Rysuje prostokąt");
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
