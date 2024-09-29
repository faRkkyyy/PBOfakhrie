public class TestCylinder {
    public static void main(String[] args) {
       // Instance silinder dengan nilai default
       Cylinder c1 = new Cylinder();
       System.out.println("Cylinder 1: " + c1);
 
       // Instance silinder dengan tinggi yang ditentukan
       Cylinder c2 = new Cylinder(10.0);
       System.out.println("Cylinder 2: " + c2);
 
       // Instance silinder dengan radius dan tinggi yang ditentukan
       Cylinder c3 = new Cylinder(2.0, 10.0);
       System.out.println("Cylinder 3: " + c3);
 
       // Instance silinder dengan radius, tinggi, dan warna yang ditentukan
       Cylinder c4 = new Cylinder(2.0, 10.0, "blue");
       System.out.println("Cylinder 4: " + c4);
    }
 }
 