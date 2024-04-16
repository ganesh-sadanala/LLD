
// Target/client: internal existing own PaymentSystem
public class PaymentAdapter extends PaymentSystem{

    // adaptee
    PaymentGateway paymentGateway;

    PaymentAdapter(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }

    // translate target calls to make use of adaptee and return the result
    @Override
    public void processPayment(double amount) {
        paymentGateway.processPayment(amount);
        String status=paymentGateway.getPaymentStatus();
        System.out.println("Payment status: " + status);
    }
}
