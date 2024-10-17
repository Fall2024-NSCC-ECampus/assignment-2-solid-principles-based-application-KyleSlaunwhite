public class Delivery {
    private String deliveryId;
    private String status;

    public Delivery(String deliveryId) {
        this.deliveryId = deliveryId;
        this.status = "Dispatched";
    }

    public void trackOrder() {
        System.out.println("Tracking order. Current status: " + status);
    }

    public void markAsDelivered() {
        this.status = "Delivered";
        System.out.println("Order marked as delivered.");
    }

    public void markAsNonDelivered() {
        this.status = "Not Delivered";
        System.out.println("Order marked as not delivered.");
    }
}
