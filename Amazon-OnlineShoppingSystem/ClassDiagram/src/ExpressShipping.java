public class ExpressShipping implements ShippingStrategy{
    @Override
    public void ship(String item) {
        System.out.println("Shipping " + item + " via International Shipping");
    }

    @Override
    public double calculateShippingCost(double weight) {
        // Calculate shipping cost based on weight for International Shipping
        return weight * 5.0;
    }
}
