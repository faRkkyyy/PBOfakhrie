public class TestCylinder {
   public static void main(String[] args) {
      // Menguji Cylinder dengan nilai default
      Cylinder c1 = new Cylinder();
      System.out.println(c1);  // Ini akan memanggil toString()

      // Menguji Cylinder dengan tinggi tertentu
      Cylinder c2 = new Cylinder(10.0);
      System.out.println(c2);  // Memanggil toString()

      // Menguji Cylinder dengan radius dan tinggi tertentu
      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println(c3);  // Memanggil toString()

      // Menguji Cylinder dengan radius, tinggi, dan warna tertentu
      Cylinder c4 = new Cylinder(2.0, 10.0, "blue");
      System.out.println(c4);  // Memanggil toString()
   }
}
