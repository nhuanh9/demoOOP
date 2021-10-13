package minitest;

public class Product {
    private String code;
    private String name;
    private String type;
    private double price;
    public static String CURRENT_UNIT = "USD";

    public Product() {
    }

    public Product(String code, String name, String type, double price) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", currencyUnit='" + CURRENT_UNIT + '\'' +
                '}';
    }
}
