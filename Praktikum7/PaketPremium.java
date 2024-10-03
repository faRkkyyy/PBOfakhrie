public class PaketPremium extends Subscription {
    
    public PaketPremium(String user) {
        super(user);
    }

    @Override
    public double calculatePrice() {
        return 100000; 
    }

    @Override
    public void subscribeInfo() {
        System.out.println(user + " Memilih paket Premium dengan harga Rp " + calculatePrice());
    }
}
