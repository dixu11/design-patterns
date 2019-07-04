package null_object.shapes;

public class ShapeFactory {

    public Shape getShape(String shapeType, int v1, int v2) {
        if ("Triangle".equalsIgnoreCase(shapeType)) {
            return new Triangle(v1, v2);
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle(v1, v2);
        }
        return new NullShape();
    }
}
