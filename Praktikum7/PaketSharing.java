public class PaketSharing extends Subscription {

    public PaketSharing(String user) {
        super(user);
    }

    @Override
    public double calculatePrice() {
        return 50000; 
    }

    @Override
    public void subscribeInfo() {
        System.out.println(user + " Memilih Paket Sharing dengan harga Rp " + calculatePrice());
    }
}
