public class ProsesPembayaran {
    public static void main(String[] args) {
        // Pemesanan 1
        Subscription premiumSub = new PaketPremium("Fakhrie");
        premiumSub.subscribeInfo();

        // Menggunakan metode pembayaran Dana
        Metode danaPayment = new Dana();
        danaPayment.processPayment(premiumSub.calculatePrice());

        System.out.println();

        // Pemesanan 2
        Subscription familyPaket = new PaketFamily("Rizdan");
        familyPaket.subscribeInfo();

        // Menggunakan metode pembayaran BCA
        Metode bcaPayment = new BCA();
        bcaPayment.processPayment(familyPaket.calculatePrice());

        System.out.println();

        // Pemesanan 3
        Subscription sharingPaket = new PaketSharing("Muzakki");
        sharingPaket.subscribeInfo();

        // Menggunakan metode pembayaran BRIMO
        Metode briPayment = new BRI();
        briPayment.processPayment(sharingPaket.calculatePrice());

        System.out.println();
    }
}
