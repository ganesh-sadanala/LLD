import java.util.List;

// Singleton Pattern
//  ParkingLot
public class ParkingLot {

    int id;
    String name;
    String address;

    List<ParkingFloor> parkingFloors;

    public static ParkingLot parkingLot;

    // Use case 3: Strategy Pattern
    PricingStrategy pricingStrategy;

    private ParkingLot(){

    }
    public static ParkingLot getParkingLot(){
        if(parkingLot==null) parkingLot=new ParkingLot();
        return parkingLot;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateParkingFee(int duration) {
        return pricingStrategy.calculateFee(duration);
    }

    boolean addEntrance(Entrance entrance){
        return true;
    }
    boolean addExit(Exit exit){
        return true;
    }
    ParkingTicket getParkingTicket(){
        return null;
    }
    boolean isFull(){
        return true;
    }

    ParkingSpot findParkingSpot(Vehicle vehicle){
        for(ParkingFloor parkingFloor: parkingFloors){
            // Use available and occupied hashmaps in each floor to determine
            // if spot found return it
        }

        // can be optimized to retrieve in O(1) by maintaining hashmaps of parkingfloors
        // having available and unavailable spots
        return null;
    }
}
