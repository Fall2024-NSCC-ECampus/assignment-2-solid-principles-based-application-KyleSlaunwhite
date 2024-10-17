public class CashOnDeliveryPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing cash on delivery payment...");
    }
}
