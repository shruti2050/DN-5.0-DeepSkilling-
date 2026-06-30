interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Rectangle");
    }
}

class ShapeFactory {

    public Shape getShape(String type) {

        if(type.equalsIgnoreCase("circle"))
            return new Circle();

        return new Rectangle();
    }
}

public class Factory {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape s = factory.getShape("circle");

        s.draw();
    }
}