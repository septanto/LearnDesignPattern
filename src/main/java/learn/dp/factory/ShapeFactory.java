package learn.dp.factory;

public class ShapeFactory {

    // use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("design.pattern.factory.Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("design.pattern.factory.Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("design.pattern.factory.Square")) {
            return new Square();
        }

        return null;
    }

}
