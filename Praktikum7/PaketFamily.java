public class PaketFamily extends Subscription {

    public PaketFamily(String user) {
        super(user);
    }

    @Override
    public double calculatePrice() {
        return 200000; // Harga dalam IDR untuk Family
    }

    @Override
    public void subscribeInfo() {
        System.out.println(user + " Memilih Paket Family dengan harga Rp " + calculatePrice());
    }
}
