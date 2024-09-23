public class Ruangan {
    private String kodeRuangan;

    public Ruangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getNama() {
        return kodeRuangan;
    }

    @Override
    public String toString() {
        return "Ruangan: " + kodeRuangan;
    }
}
