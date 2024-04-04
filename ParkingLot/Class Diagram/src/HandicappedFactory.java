public class HandicappedFactory implements ParkingSpotAbstractFactory{

    @Override
    public ParkingSpot createParkingSpot() {
        return new Handicapped();
    }
}
