public class StandardShipping implements ShippingStrategy{
    @Override
    public void ship(String item) {
        System.out.println("Shipping " + item + " via Standard Shipping");
    }

    @Override
    public double calculateShippingCost(double weight) {
        // Calculate shipping cost based on weight for Standard Shipping
        return weight * 1.5;
    }
}
