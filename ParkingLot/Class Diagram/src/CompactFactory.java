public class CompactFactory implements ParkingSpotAbstractFactory{

    @Override
    public ParkingSpot createParkingSpot() {
        return new Compact();
    }
}
