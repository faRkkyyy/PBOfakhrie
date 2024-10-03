public class Dana implements Metode {

    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran sebesar Rp " + amount + " diproses melalui aplikasi Dana.");
    }
}
