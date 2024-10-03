public abstract class Subscription {
    protected String user;
    
    public Subscription(String user) {
        this.user = user;
    }

    public abstract double calculatePrice();
    
    public void subscribeInfo() {
        System.out.println("User: " + user + " memilih jenis langganan.");
    }
}
