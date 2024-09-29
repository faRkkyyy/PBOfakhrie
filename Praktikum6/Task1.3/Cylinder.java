public class Cylinder extends Circle {
   private double height;

   // Constructor default
   public Cylinder() {
      super();
      this.height = 1.0;
   }

   // Constructor dengan height yang ditentukan
   public Cylinder(double height) {
      super();
      this.height = height;
   }

   // Constructor dengan radius dan height yang ditentukan
   public Cylinder(double radius, double height) {
      super(radius);
      this.height = height;
   }

   // Constructor dengan radius, height, dan color yang ditentukan
   public Cylinder(double radius, double height, String color) {
      super(radius, color);
      this.height = height;
   }

   // Getter dan setter untuk height
   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   // Overriding method getArea() untuk menghitung luas permukaan silinder
   @Override
   public double getArea() {
      double radius = getRadius();
      return 2 * Math.PI * radius * height + 2 * super.getArea(); // Luas permukaan silinder
   }

   // Metode untuk menghitung volume silinder
   public double getVolume() {
      return super.getArea() * height; // Menggunakan area alas lingkaran
   }

   // Override method toString() dari Circle
   @Override
   public String toString() {
      return "Cylinder: subclass of " + super.toString() + " height=" + height;
   }
}
