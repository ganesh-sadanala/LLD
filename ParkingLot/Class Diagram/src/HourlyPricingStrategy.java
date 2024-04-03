public class HourlyPricingStrategy implements PricingStrategy{
    private double hourlyRate;

    public HourlyPricingStrategy(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateFee(int duration) {
        return duration * hourlyRate;
    }
}
