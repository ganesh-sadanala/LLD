public interface ShippingStrategy {
    void ship(String item);
    double calculateShippingCost(double weight);
}
