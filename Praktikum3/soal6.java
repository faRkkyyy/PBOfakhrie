import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dua angka besar
        String a = scanner.next();
        String b = scanner.next();
        
        // Membuat BigInteger dari input
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        // Penjumlahan dan perkalian
        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);
        
        // Output hasil penjumlahan dan perkalian
        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }
}
