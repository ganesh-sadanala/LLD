public class CreditCard extends Payment{
    private String name;
    private String cardNumber;
    private String cvv;

    boolean makePayment() {
        return false;
    }
}
