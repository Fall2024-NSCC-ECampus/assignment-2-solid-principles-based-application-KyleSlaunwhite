public class Main {
    public static void main(String[] args) {
        // Create Product
        Product product = new Product("P123", "Smartphone", 999.99);

        // Place Order
        Order order = new Order("O001", product);
        order.placeOrder();

        // Payment
        Payment paymentMethod = new CreditCardPayment(); // Can be changed to other payment types
        order.processPayment(paymentMethod);

        // Generate Receipt
        order.generateReceipt();

        // Hub and Delivery
        Hub hub = new Hub("Main Hub", 15.0);
        System.out.println("Delivery Rate: $" + hub.calculateDeliveryRate());

        Delivery delivery = new Delivery("D001");
        delivery.trackOrder();
        delivery.markAsDelivered();

        // Review
        Review review = new Review("Great product!", 5);
        review.addReview();

        // Company Details
        Company company = new Company("FastCourier Ltd.", "123 Delivery St.", "contact@fastcourier.com");
        company.getCompanyDetails();
    }
}
