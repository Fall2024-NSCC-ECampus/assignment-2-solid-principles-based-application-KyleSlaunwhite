public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductDetails() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: $" + price;
    }

    public double calculatePrice() {
        return price;
    }
}
