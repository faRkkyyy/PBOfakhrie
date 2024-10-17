public class PaintThings {
    public static void main(String[] args) {
        // Membuat objek paint dengan cakupan 350 unit area per gallon
        Paint paint = new Paint(350); 
        
        // Membuat objek bentuk geometris
        Rectangle deck = new Rectangle(20, 35);
        double deckAmount = paint.amount(deck);
        System.out.printf("Paint required for deck: %.2f gallons\n", deckAmount);
        

        Sphere bigBall = new Sphere(15);
        double ballAmount = paint.amount(bigBall);
        System.out.printf("Paint required for bigBall: %.2f gallons\n", ballAmount);

        Cylinder tank = new Cylinder(10, 30);
        double tankAmount = paint.amount(tank);
        System.out.printf("Paint required for tank: %.2f gallons\n", tankAmount);        
    }
}
