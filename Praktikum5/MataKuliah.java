// File: MataKuliah.java
import java.util.List;

public class MataKuliah {

    private String jenis;
    private String nama;
    private String jam;
    private List<Dosen> dosenList; // Menggunakan List untuk banyak dosen
    private Ruangan ruangan;

    public MataKuliah(String jenis, String nama, String jam, List<Dosen> dosenList, Ruangan ruangan) {
        this.jenis = jenis;
        this.nama = nama;
        this.jam = jam;
        this.dosenList = dosenList;
        this.ruangan = ruangan;
    }

    public String getjenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getJam() {
        return jam;
    }

    public List<Dosen> getDosenList() {
        return dosenList;
    }

    public void setDosenList(List<Dosen> dosenList) {
        this.dosenList = dosenList;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    @Override
    public String toString() {
        StringBuilder dosenNames = new StringBuilder();
        for (Dosen dosen : dosenList) {
            dosenNames.append(dosen.getNama()).append(", ");
        }
        // Menghapus koma dan spasi terakhir
        if (dosenNames.length() > 0) {
            dosenNames.setLength(dosenNames.length() - 2);
        }
        return String.format("%s | %s (%s) | Dosen: %s | Ruang: %s", 
                             jam, nama, jenis, dosenNames.toString(), ruangan.getNama());
    }
}
