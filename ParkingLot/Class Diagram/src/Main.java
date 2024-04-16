public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ParkingSpot regularSpot = ParkingSpotFactory.createParkingSpot("regular");
        System.out.println(regularSpot.getType());  // Output: Regular Parking Spot

        ParkingSpot handicappedSpot = ParkingSpotFactory.createParkingSpot("handicapped");
        System.out.println(handicappedSpot.getType());  // Output: Handicapped Parking Spot

        ParkingSpot electricSpot = ParkingSpotFactory.createParkingSpot("electric");
        System.out.println(electricSpot.getType());  // Output: Electric Vehicle Parking Spot

        ParkingLot parkingLot = new ParkingLot();

        // Set the pricing strategy to hourly
        parkingLot.setPricingStrategy(new HourlyPricingStrategy(2.5));
        double hourlyFee = parkingLot.calculateParkingFee(3);
        System.out.println("Hourly Fee: $" + hourlyFee);

        // Set the pricing strategy to daily
        parkingLot.setPricingStrategy(new DailyPricingStrategy(20.0));
        double dailyFee = parkingLot.calculateParkingFee(2);
        System.out.println("Daily Fee: $" + dailyFee);

        // Set the pricing strategy to monthly
        parkingLot.setPricingStrategy(new MonthlyPricingStrategy(500.0));
        double monthlyFee = parkingLot.calculateParkingFee(1);
        System.out.println("Monthly Fee: $" + monthlyFee);


    }
}