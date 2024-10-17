public class Sphere extends Shape {
    private double radius;

    // Constructor untuk Sphere
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Implementasi metode area() untuk menghitung luas permukaan bola
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Implementasi metode toString() untuk mengembalikan nama bentuk
    @Override
    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}
