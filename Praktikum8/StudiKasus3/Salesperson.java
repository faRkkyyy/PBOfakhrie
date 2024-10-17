public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    // Compare based on total sales. If sales are equal, compare by last name
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;
        } else {
            return other.lastName.compareTo(this.lastName); // Reverse alphabetical order for tie
        }
    }
}
