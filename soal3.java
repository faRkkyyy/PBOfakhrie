import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari user
        System.out.print("Input Angka: ");
        int A = scanner.nextInt();
        String operator = scanner.next();
        int B = scanner.nextInt();
        scanner.close();

        int result = 0;

        // Memproses operator
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                result = A / B; // Karena dibatasi A habis dibagi B, pembagian akan selalu valid
                break;
            case "%":
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        // Mencetak hasil
        System.out.println(result);
    }
}
