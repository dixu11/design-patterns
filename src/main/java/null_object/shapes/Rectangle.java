package null_object.shapes;

public class Rectangle implements Shape {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getArea() {
        return x * y;
    }

    @Override
    public void draw() {
        System.out.println("This is rectangle!");
    }
}
