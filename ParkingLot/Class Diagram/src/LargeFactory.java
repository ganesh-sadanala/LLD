public class LargeFactory implements ParkingSpotAbstractFactory{

    @Override
    public ParkingSpot createParkingSpot() {
        return new Large();
    }
}
