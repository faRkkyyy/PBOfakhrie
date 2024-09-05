import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari user
        System.out.print("Input Kata: ");
        String s = scanner.nextLine();
        scanner.close();

        // Menggunakan regex 
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Mencetak jumlah token
        System.out.println(tokens.length);

        // Mencetak setiap token di baris baru
        for (String token : tokens) {
            if (!token.isEmpty()) { // Mengabaikan token kosong
                System.out.println(token);
            }
        }
    }
}


