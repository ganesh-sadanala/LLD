public class StripeGateway implements PaymentGateway{

    @Override
    public void processPayment(double amount) {
        // Stripe payment processing logic
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }

    @Override
    public String getPaymentStatus() {
        return "SUCCESS";
    }
}
