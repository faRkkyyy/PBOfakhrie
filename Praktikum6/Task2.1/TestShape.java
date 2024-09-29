// TestShape.java
public class TestShape {
    public static void main(String[] args) {
        // Test Circle
        Circle circle = new Circle(5.0, "blue", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Test Rectangle
        Rectangle rectangle = new Rectangle(2.0, 4.0, "red", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Test Square
        Square square = new Square(3.0, "yellow", true);
        System.out.println(square);
        square.setLength(5.0);
        System.out.println("Updated Square: " + square);
    }
}
