public class Reserved implements ParkingSpotState{

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public boolean isOccupied() {
        return false;
    }

    @Override
    public boolean isReserved() {
        return true;
    }

    @Override
    public void assignVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setState(new Occupied());
    }

    @Override
    public void removeVehicle(ParkingSpot spot) {
        spot.setVehicle(null);
        spot.setState(new Available());
    }
}
