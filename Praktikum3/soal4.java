import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Gaji pokok dan harga per item
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        double gajiAkhir = gajiPokok;
        
        // Input jumlah item yang dijual
        System.out.print("Input jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();
        
        // Hitung total penjualan
        System.out.print("Gaji yang diterima: ");
        int totalPenjualan = jumlahPenjualan * hargaPerItem;
        
        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            // Bonus 25% jika penjualan antara 40 dan 80 item
            gajiAkhir += totalPenjualan * 0.25;
        } else if (jumlahPenjualan > 80) {
            // Bonus 35% jika penjualan lebih dari 80 item
            gajiAkhir += totalPenjualan * 0.35;
        } else if (jumlahPenjualan < 15) {
            // Denda 15% dari kekurangan penjualan ke 15 item
            int kekurangan = 15 - jumlahPenjualan;
            double denda = kekurangan * hargaPerItem * 0.15;
            gajiAkhir -= denda;
        } else {
            // Bonus 10% jika penjualan di bawah 40 item tapi tidak kurang dari 15
            gajiAkhir += totalPenjualan * 0.10;
        }
        
        // Cetak gaji akhir
        System.out.println((int) gajiAkhir);
        
        scanner.close();
    }
}
