public class Circle {
    // private instance variable
    private double radius;
    private String color;
 
    // Constructor tanpa parameter (default)
    public Circle() {
       this.radius = 1.0;
       this.color = "red";
    }
 
    // Constructor dengan parameter radius saja (warna default merah)
    public Circle(double radius) {
       this.radius = radius;
       this.color = "red";
    }
 
    // Constructor dengan parameter radius dan color
    public Circle(double radius, String color) {
       this.radius = radius;
       this.color = color;
    }
 
    // Getter untuk radius
    public double getRadius() {
       return radius;
    }
 
    // Setter untuk radius
    public void setRadius(double radius) {
       this.radius = radius;
    }
 
    // Getter untuk color
    public String getColor() {
       return color;
    }
 
    // Setter untuk color
    public void setColor(String color) {
       this.color = color;
    }
 
    // Method untuk menghitung luas lingkaran
    public double getArea() {
       return radius * radius * Math.PI;
    }
 
    // toString method untuk mendeskripsikan objek
    @Override
    public String toString() {
       return "Circle[radius=" + radius + ", color=" + color + "]";
    }
 }
 