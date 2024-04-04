public class PaymentAdapter extends PaymentSystem{

    PaymentGateway paymentGateway;

    PaymentAdapter(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }
    @Override
    public void processPayment(double amount) {
        paymentGateway.processPayment(amount);
    }
}
