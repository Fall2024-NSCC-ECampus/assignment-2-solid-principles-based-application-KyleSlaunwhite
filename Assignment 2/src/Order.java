public class Order {
    private String orderId;
    private Product product;
    private Payment payment;

    public Order(String orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public void placeOrder() {
        System.out.println("Order placed for: " + product.getProductDetails());
    }

    public void returnOrder() {
        System.out.println("Order returned for: " + product.getProductDetails());
    }

    public void processPayment(Payment paymentMethod) {
        this.payment = paymentMethod;
        payment.processPayment();
    }

    public void generateReceipt() {
        System.out.println("Receipt generated for Order ID: " + orderId);
    }
}
