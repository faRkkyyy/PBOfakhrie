public class Square extends Rectangle {
    // Konstruktor dengan sisi
    public Square(double side) {
        super(side, side); // Memanggil konstruktor Rectangle
    }

    // Konstruktor dengan sisi, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Memanggil konstruktor Rectangle
    }

    // Override setWidth dan setLength untuk memastikan bentuk tetap persegi
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override metode toString
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}