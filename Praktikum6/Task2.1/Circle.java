public class Circle extends Shape {
    private double radius;

    // Konstruktor tanpa argumen
    public Circle() {
        super(); // Memanggil konstruktor dari Shape
        this.radius = 1.0;
    }

    // Konstruktor dengan radius
    public Circle(double radius) {
        super(); // Memanggil konstruktor dari Shape
        this.radius = radius;
    }

    // Konstruktor dengan radius, color, dan filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor dari Shape
        this.radius = radius;
    }

    // Getter dan setter untuk radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung luas
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode untuk menghitung keliling
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString dari Shape
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
