// File: Dosen.java
public class Dosen {
    private String nama;
    private String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return String.format("Nama Dosen: %s\nNIP: %s", nama, nip);
    }
}
