package Session1;

interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle Class");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square Class");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle Class");
    }
}

class ShapeFactory{
    //Here parent Interface "Shape" is used as return type so that it can hold any shape of its child classes which implements it.
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else{
            return null;
        }
    }
}

public class FactoryPatternDesign {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        //Object of Interface or abstract class cannot be created but there reference can be created which can point
        //to object of classes that implements these interfaces.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
    }
}
