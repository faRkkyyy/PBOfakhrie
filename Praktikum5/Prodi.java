// File: Prodi.java
public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private Jurusan jurusan;

    public Prodi(String kodeProdi, String namaProdi, Jurusan jurusan) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.jurusan = jurusan;
    }

    public String getKodeProdi() {
        return kodeProdi;
    }

    public void setKodeProdi(String kodeProdi) {
        this.kodeProdi = kodeProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return String.format("Prodi: %s\nJurusan: %s", namaProdi, jurusan);
    }
}
