package null_object.shapes;

public class NullShape implements Shape {

    @Override

    public int getArea() {

        return Integer.MIN_VALUE;

    }



    @Override

    public void draw() {

        System.out.println("This is null shape!");

    }

}
