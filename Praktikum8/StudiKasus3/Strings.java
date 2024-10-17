import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = scan.nextInt();
        String[] strings = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scan.next();
        }

        Sorting.selectionSort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}
