public class ExpressShipping implements ShippingStrategy{
    @Override
    public void ship(String item) {

    }

    @Override
    public double calculateShippingCost(double weight) {
        return 0;
    }
}
