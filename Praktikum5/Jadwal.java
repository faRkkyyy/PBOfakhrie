// File: Jadwal.java
public class Jadwal {
    private String hari;
    private MataKuliah[] mataKuliahList;

    public Jadwal(String hari, MataKuliah[] mataKuliahList) {
        this.hari = hari;
        this.mataKuliahList = mataKuliahList;
    }

    public String getHari() {
        return hari;
    }

    public MataKuliah[] getMataKuliahList() {
        return mataKuliahList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t").append(hari).append("\n");  // Menampilkan hari
        for (MataKuliah mk : mataKuliahList) {
            sb.append(mk).append("\n");
        }
        return sb.toString();
    }
}
