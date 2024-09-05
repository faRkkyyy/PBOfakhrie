import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays untuk menyimpan input
        String[] inputStrings = new String[3];
        int[] inputInts = new int[3];
        
        System.out.println("================================");

        // Input data sebanyak 3 kali (string dan angka di satu baris)
        for (int i = 0; i < 3; i++) {
            System.out.print("input angka: ");
            inputStrings[i] = scanner.next();
            inputInts[i] = scanner.nextInt();
        }

        // Memberikan jarak (newline) setelah input selesai
        System.out.println();

        // Output hasil yang diinput sebelumnya tanpa garis pembatas
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", inputStrings[i], inputInts[i]);
        }

        System.out.println("================================");

        scanner.close();
    }
}


