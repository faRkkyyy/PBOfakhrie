import java.util.Scanner;

public class Strings {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two lines of input
        String a = sc.nextLine();
        String b = sc.nextLine();

        // Calculate the total length of both strings
        int length = a.length() + b.length();
        System.out.println("Panjang string: " + length);

        // Compare the two strings ignoring case
        int result = a.compareToIgnoreCase(b);
        if (result < 0) {
            System.out.println("Yes");
        } else if (result > 0) {
            System.out.println("No");
        }

        // Capitalize the first letter of both strings and concatenate
        String satu = a.substring(0, 1).toUpperCase() + a.substring(1);
        String dua = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(satu + " " + dua);

        // Close the scanner
        sc.close();
    }
}