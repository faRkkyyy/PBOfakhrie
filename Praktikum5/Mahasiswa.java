public class Mahasiswa {
    private String nama;
    private String nim;
    private Prodi prodi;

    public Mahasiswa(String nama, String nim, Prodi prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return String.format("Nama: %s\nNIM: %s\n%s", nama, nim, prodi);
    }
}
