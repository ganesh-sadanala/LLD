public class PaymentGatewayFactory {
    public static PaymentGateway createPaymentGateway(String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("paypal")) {
            return new PayPalGateway();
        } else if (paymentMethod.equalsIgnoreCase("stripe")) {
            return new StripeGateway();
        } else {
            throw new IllegalArgumentException("Invalid payment method.");
        }
    }
}
