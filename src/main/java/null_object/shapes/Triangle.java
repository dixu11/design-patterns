package null_object.shapes;

public class Triangle implements Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public int getArea() {
        return a * h / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is triangle!");
    }
}
