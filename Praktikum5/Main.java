// File: Main.java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Data Jurusan
        Jurusan jurusan1 = new Jurusan("J01", "Teknik Komputer dan Informatika");

        // Data Prodi
        Prodi prodi1 = new Prodi("P01", "D3 Teknik Informatika", jurusan1);
        Prodi prodi2 = new Prodi("P02", "D4 Teknik Informatika", jurusan1);

        // Data Mahasiswa
        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("Dio Rahman Putra", "231511073", prodi1),
            new Mahasiswa("Elsa Monika Sinaga", "231511074", prodi1),
            new Mahasiswa("Fakhrie Rizdan Muzakki", "231511075", prodi1),
            new Mahasiswa("Fauzan Ramadhan", "231511076", prodi2),
            new Mahasiswa("Hafizh Muhammad", "231511077", prodi2),
            new Mahasiswa("Isyana Putri", "231511078", prodi2),
            new Mahasiswa("Jihan Humaira", "231511079", prodi1),
            new Mahasiswa("Muhamad Haikal Hariyanto", "231511081", prodi1),
            new Mahasiswa("Muhammad Daffa", "231511082", prodi2),
            new Mahasiswa("Muhammad Dzaki", "231511083", prodi2)
        };

        // Data Dosen
        Dosen[] dosenList = {
            new Dosen("Ade Chandra Nugraha", "KO001N"),
            new Dosen("Irawan Thamrin", "KO006N"),
            new Dosen("Santi Sundari", "KO009N"),
            new Dosen("Yudi Widhiyasana", "KO013N"),
            new Dosen("Suprihanto", "KO022N"),
            new Dosen("Irwan Setiawan", "KO045N"),
            new Dosen("Yadhi Aditya P.", "KO052N"),
            new Dosen("Ade Hodijah", "KO060N"),
            new Dosen("Zulkifli Arsyad", "KO061N"),
            new Dosen("Muhammad Rizqi S.", "KO074N"),
            new Dosen("Trisna Gelar A.", "KO078N")
        };

        // Data Ruangan
        Ruangan[] ruanganList = {
            new Ruangan("D101"),
            new Ruangan("D102"),
            new Ruangan("D106"),
            new Ruangan("D217")
        };

        // Data Mata Kuliah
        MataKuliah[] mataKuliahList = {

            // Senin
            new MataKuliah("TEORI", "PBO", "08:40-10:40", 
                Arrays.asList(dosenList[6]), ruanganList[3]),
            new MataKuliah("TEORI", "KOMGRAF", "10:40-12:20", 
                Arrays.asList(dosenList[3]), ruanganList[3]),
            new MataKuliah("TEORI", "MATDIS", "13:00-15:30", 
                Arrays.asList(dosenList[4]), ruanganList[3]),
            new MataKuliah("PRAKTEK", "KOMGRAF", "15:50-18:20", 
                Arrays.asList(dosenList[10]), ruanganList[1]),
            // Selasa
            new MataKuliah("TEORI", "BASIS DATA", "07:00-08:40", 
                Arrays.asList(dosenList[0]), ruanganList[0]),
            new MataKuliah("TEORI", "ALIN", "10:40-12:20", 
                Arrays.asList(dosenList[9]), ruanganList[0]),
            new MataKuliah("TEORI", "PRPL", "13:00-15:30", 
                Arrays.asList(dosenList[2]), ruanganList[0]),  
            // Rabu    
            new MataKuliah("TEORI", "PROYEK 3", "07:00-07:50", 
                Arrays.asList(dosenList[10]), ruanganList[1]),
            new MataKuliah("PRAKTEK", "PROYEK 3", "07:50-16:40", 
                Arrays.asList(dosenList[10], dosenList[1],dosenList[5]), ruanganList[1]),
            // Kamis
            new MataKuliah("PRAKTEK", "PRPL", "09:50-15:30", 
                Arrays.asList(dosenList[6]), ruanganList[2]),
            new MataKuliah("PRAKTEK", "PBO", "15:50-18:20", 
                Arrays.asList(dosenList[8]), ruanganList[1]),
            // Jumat
            new MataKuliah("PRAKTEK", "BASIS DATA", "07:00-13:50", 
                Arrays.asList(dosenList[7]), ruanganList[2]),
            
            
        };

        // Jadwal Kuliah
        Jadwal[] jadwalList = {
            new Jadwal("Senin", new MataKuliah[] {
                mataKuliahList[0], mataKuliahList[1], mataKuliahList[2], mataKuliahList[3]
            }),
            new Jadwal("Selasa", new MataKuliah[] {
                mataKuliahList[4], mataKuliahList[5], mataKuliahList[6]
            }),
            new Jadwal("Rabu", new MataKuliah[] {
                mataKuliahList[7], mataKuliahList[8]
            }),
            new Jadwal("Kamis", new MataKuliah[] {
                mataKuliahList[9], mataKuliahList[10]
            }),
            new Jadwal("Jumat", new MataKuliah[] {
                mataKuliahList[11]
            })
        };

        // Menampilkan Data Jurusan dan Prodi
        System.out.println("===== Data Jurusan dan Prodi =====");
        System.out.println(jurusan1);
        System.out.println(prodi1);
        System.out.println(prodi2);

        // Menampilkan Data Mahasiswa
        System.out.println("\n===== Data Mahasiswa =====");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
            System.out.println(); // Tambahkan jarak 1 baris
        }

        // Menampilkan Data Dosen
        System.out.println("\n===== Data Dosen =====");
        for (Dosen dosen : dosenList) {
            System.out.println(dosen);
            System.out.println(); // Tambahkan jarak 1 baris
        }

        // Menampilkan Data Ruangan
        System.out.println("\n===== Data Ruangan =====");
        for (Ruangan ruangan : ruanganList) {
            System.out.println(ruangan);
        }

        // Menampilkan Jadwal Perkuliahan dengan jarak sebelum hari
        System.out.println("\n===== Jadwal Kuliah =====\n");
        for (Jadwal jadwal : jadwalList) {
            System.out.println(jadwal);
            System.out.println(); // Tambahkan jarak 1 baris sebelum hari berikutnya
        }
    }
}
