// Use case 2: Factory Pattern
public class ParkingSpotFactory {
    public static ParkingSpot createParkingSpot(String spotType) {
        switch (spotType) {
            case "Large":
                return new Large();
            case "handicapped":
                return new Handicapped();
            case "electric":
                return new Electric();
            default:
                throw new IllegalArgumentException("Invalid parking spot type: " + spotType);
        }
    }
}
