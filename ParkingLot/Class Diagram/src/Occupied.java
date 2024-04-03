public class Occupied implements ParkingSpotState{

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean isOccupied() {
        return true;
    }

    @Override
    public boolean isReserved() {
        return false;
    }

    @Override
    public void assignVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
//        parkingSpot.setVehicle(vehicle);
//        parkingSpot.setState();
    }

    @Override
    public void removeVehicle(ParkingSpot spot) {
        spot.setVehicle(null);
        spot.setState(new Available());
    }
}
