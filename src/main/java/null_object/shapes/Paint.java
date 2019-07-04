package null_object.shapes;

import java.time.LocalDateTime;

public class Paint {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        String shapesToGenerate[] = {"Triangle", "Circle", "Rectangle"};
        for (String shapeType : shapesToGenerate) {
            Shape shape = shapeFactory.getShape(shapeType, 20, 20);
            System.out.println(shape.getArea());
            shape.draw();
        }
        LocalDateTime.of(2020, 10, 20, 13, 33);

    }
}
