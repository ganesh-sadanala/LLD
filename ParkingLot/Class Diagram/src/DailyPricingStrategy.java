public class DailyPricingStrategy implements PricingStrategy{
    private double dailyRate;

    public DailyPricingStrategy(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateFee(int duration) {
        return duration * dailyRate;
}
