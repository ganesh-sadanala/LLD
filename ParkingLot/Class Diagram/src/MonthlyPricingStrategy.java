public class MonthlyPricingStrategy implements PricingStrategy{
    private double monthlyRate;

    public MonthlyPricingStrategy(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    @Override
    public double calculateFee(int duration) {
        return duration * monthlyRate;
    }
}
