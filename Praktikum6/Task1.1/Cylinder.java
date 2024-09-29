public class Cylinder extends Circle {
   // private instance variable
   private double height;

   // Constructor default tanpa parameter
   public Cylinder() {
      super(); // memanggil constructor default dari Circle
      this.height = 1.0;
   }

   // Constructor dengan parameter height
   public Cylinder(double height) {
      super(); // memanggil constructor default dari Circle
      this.height = height;
   }

   // Constructor dengan parameter radius dan height
   public Cylinder(double radius, double height) {
      super(radius); // memanggil constructor Circle dengan radius
      this.height = height;
   }

   // Constructor dengan parameter radius, height, dan color
   public Cylinder(double radius, double height, String color) {
      super(radius, color); // memanggil constructor Circle dengan radius dan color
      this.height = height;
   }

   // Getter untuk height
   public double getHeight() {
      return height;
   }

   // Setter untuk height
   public void setHeight(double height) {
      this.height = height;
   }

   // Method untuk menghitung volume silinder
   public double getVolume() {
      return getArea() * height; // menggunakan getArea() dari Circle
   }

   // toString method untuk mendeskripsikan objek Cylinder
   @Override
   public String toString() {
      return "Cylinder: subclass of " + super.toString() + ", height=" + height;
   }
}

