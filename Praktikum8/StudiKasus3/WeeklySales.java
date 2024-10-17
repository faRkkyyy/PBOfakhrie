import java.util.Arrays;

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = {
            new Salesperson("Jane", "Doe", 200),
            new Salesperson("John", "Smith", 500),
            new Salesperson("Joe", "Black", 500),
            new Salesperson("Anne", "Boleyn", 300),
            new Salesperson("Cathy", "Johnson", 300),
            new Salesperson("Steve", "Brown", 500)
        };

        // Sort sales staff using insertion sort in descending order of sales
        Sorting.insertionSort(salesStaff);

        System.out.println("Sorted Sales Staff:");
        for (Salesperson person : salesStaff) {
            System.out.println(person);
        }
    }
}
