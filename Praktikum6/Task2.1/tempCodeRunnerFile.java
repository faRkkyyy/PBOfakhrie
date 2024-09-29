public class Rectangle extends Shape {
    private double width;
    private double length;

    // Konstruktor tanpa argumen
    public Rectangle() {
        super(); // Memanggil konstruktor dari Shape
        this.width = 1.0;
        this.length = 1.0;
    }

    // Konstruktor dengan width dan length
    public Rectangle(double width, double length) {
        super(); // Memanggil konstruktor dari Shape
        this.width = width;
        this.length = length;
    }

    // Konstruktor dengan color, filled, width, dan length
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor dari Shape
        this.width = width;
        this.length = length;
    }

    // Getter dan setter untuk width dan length
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Metode untuk menghitung luas
    public double getArea() {
        return width * length;
    }

    // Metode untuk menghitung keliling
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString dari Shape
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
