import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        // Prompt for and read in a line of input
        System.out.println("Enter a line of text:");
        String line = scan.nextLine();
        Scanner scanLine = new Scanner(line);

        // Process each token in the line
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); // Attempt to parse the token as an integer
                sum += val;
            } catch (NumberFormatException e) {
                // Handle non-integer tokens
                System.out.println("Not an integer, skipping.");
            }
        }

        // Print the sum of valid integers
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
