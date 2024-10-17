import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;

class Status {
    private int code;
    private String description;

    // Constructor
    public Status(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}

class ServicePackage {
    private String service;
    private int value;

    // Constructor
    public ServicePackage(String service, int value) {
        this.service = service;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ServicePackage{" +
                "service='" + service + '\'' +
                ", value=" + value +
                '}';
    }
}

class City {
    private String origin;
    private String destination;

    // Constructor
    public City(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "City{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}

class Order {
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private int priceltem;
    private String productName;

    // Constructor
    public Order(Status status, ServicePackage servicePackage, City city, int weight, int quantity, int priceltem, String productName) {
        this.status = status;
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceltem = priceltem;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                ", servicePackage=" + servicePackage +
                ", city=" + city +
                ", weight=" + weight +
                ", quantity=" + quantity +
                ", priceltem=" + priceltem +
                ", productName='" + productName + '\'' +
                '}';
    }
}

public class soal1 {
    public static void main(String[] args) {
        // JSON string
        String jsonString = "[{\n" +
                "\"status\": {\n" +
                "\"code\": 0,\n" +
                "\"description\": \"OK\"\n" +
                "},\n" +
                "\"servicePackage\": {\n" +
                "\"service\": \"REGULAR (REG)\",\n" +
                "\"value\": 15000\n" +
                "},\n" +
                "\"city\":{\n" +
                "\"origin\": \"BANDUNG\" ,\n" +
                "\"destination\": \"JAKARTA\"\n" +
                "},\n" +
                "\"weight\":2,\n" +
                "\"quantity\":1,\n" +
                "\"priceltem\": 80000,\n" +
                "\"productName\": \"Celana Jeans\"\n" +
                "},{\n" +
                "\"status\": {\n" +
                "\"code\": 0,\n" +
                "\"description\": \"OK\"\n" +
                "},\n" +
                "\"servicePackage\": {\n" +
                "\"service\": \"Requler (REG)\",\n" +
                "\"value\": 26000\n" +
                "},\n" +
                "\"city\":{\n" +
                "\"origin\": \"BANDUNG\" ,\n" +
                "\"destination\": \"SURABAYA\"\n" +
                "},\n" +
                "\"weight\":2, \"quantity\":2,\n" +
                "\"priceltem\": 90000,\n" +
                "\"productName\": \"Kemeja Lengan Panjang\"\n" +
                "}]";
                
        // penggunaan gson
        Gson gson = new Gson();
        Order[] orders = gson.fromJson(jsonString, Order[].class);

        Arrays.stream(orders).forEach(System.out::println);
    }
}
