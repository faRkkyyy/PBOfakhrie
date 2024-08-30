import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca jumlah kasus uji
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            System.out.print("Masukkan Angka : ");


            try {
                // Membaca angka
                long angka = sc.nextLong();
                System.out.println(angka + " can be fitted in:");
                
                // Memeriksa tipe data yang cocok
                if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Jika angka tidak bisa diparsing sebagai long
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}
