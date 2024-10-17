public class Hub {
    private String hubName;
    private double deliveryRate;

    public Hub(String hubName, double deliveryRate) {
        this.hubName = hubName;
        this.deliveryRate = deliveryRate;
    }

    public double calculateDeliveryRate() {
        return deliveryRate;
    }

    public void updateHubDetails(String hubName, double newRate) {
        this.hubName = hubName;
        this.deliveryRate = newRate;
    }
}
