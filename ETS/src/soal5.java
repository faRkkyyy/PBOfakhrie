import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;

class Status {
    private int code;
    private String description;

    public Status(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

class ServicePackage {
    private String service;
    private int value;

    public ServicePackage(String service, int value) {
        this.service = service;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return service;
    }
}


class City {
    private String origin;
    private String destination;

    public City(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return destination;
    }
}

abstract class PaymentService {
    protected String paymentMethod;
    protected String paymentStatus;

    public PaymentService(String paymentMethod, String paymentStatus) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }
}

class OVO extends PaymentService {
    public OVO() {
        super("OVO", "Paid");
    }
}

class QRIS extends PaymentService {
    public QRIS() {
        super("QRIS", "Unpaid");
    }
}

class Cash extends PaymentService {
    public Cash() {
        super("Cash", "Pending");
    }
}

class Order {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceItem; // Corrected typo 'priceltem'
    private String productName;
    private PaymentService paymentService;

    public Order(Status status, ServicePackage servicePackage, City city, int weight, int quantity, int priceItem, String productName, PaymentService paymentService) {
        this.status = status;
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
        this.paymentService = paymentService;
    }


    public int getTotalCost() {
        return (priceItem * quantity) + servicePackage.getValue();
    }


    public void printOrder() {
        System.out.printf("%-15s | %-8d | %-6d | %-11s | %-14s | %-12d | %-6d | %-13s | %-13s%n", 
            productName, quantity, weight, city, servicePackage, servicePackage.getValue(), getTotalCost(), paymentService.getPaymentMethod(), paymentService.getPaymentStatus());
    }
}

public class soal5 {
    public static void main(String[] args) {
        
        String jsonString = "[{\"status\":{\"code\":0,\"description\":\"OK\"},"
                + "\"servicePackage\":{\"service\":\"REGULAR (REG)\",\"value\":15000},"
                + "\"city\":{\"origin\":\"BANDUNG\",\"destination\":\"JAKARTA\"},"
                + "\"weight\":2,\"quantity\":1,\"priceItem\":80000,\"productName\":\"Celana Jeans\"},"
                + "{\"status\":{\"code\":0,\"description\":\"OK\"},"
                + "\"servicePackage\":{\"service\":\"Requler (REG)\",\"value\":26000},"
                + "\"city\":{\"origin\":\"BANDUNG\",\"destination\":\"SURABAYA\"},"
                + "\"weight\":2,\"quantity\":2,\"priceItem\":90000,\"productName\":\"Kemeja Lengan Panjang\"}]";

    
        Gson gson = new Gson();
        Order[] orders = {
                new Order(new Status(0, "OK"), new ServicePackage("REGULAR (REG)", 15000), new City("BANDUNG", "JAKARTA"), 2, 1, 80000, "Celana Jeans", new OVO()),
                new Order(new Status(0, "OK"), new ServicePackage("Requler (REG)", 26000), new City("BANDUNG", "SURABAYA"), 2, 2, 90000, "Kemeja Lengan Panjang", new Cash())
        };

        
        System.out.printf("%-15s | %-8s | %-6s | %-11s | %-14s | %-12s | %-6s | %-13s | %-13s%n", 
            "productName", "quantity", "weight", "destination", "servicePackage", "serviceValue", "Total", "paymentMethod", "paymentStatus");
        System.out.println("-----------------------------------------------------------------------------------------------");

        Arrays.stream(orders).forEach(Order::printOrder);
    }
}
