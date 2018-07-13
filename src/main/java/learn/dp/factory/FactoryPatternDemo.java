package learn.dp.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of design.pattern.factory.Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("design.pattern.factory.Circle");

        // call draw method of design.pattern.factory.Circle
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("design.pattern.factory.Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("design.pattern.factory.Square");
        shape3.draw();

    }

}
