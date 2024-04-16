public class PayPalGateway implements PaymentGateway{

    @Override
    public void processPayment(double amount) {
        // PayPal payment processing logic
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }

    @Override
    public String getPaymentStatus() {
        return "SUCCESS";
    }
}
