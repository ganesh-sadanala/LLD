public class Available implements ParkingSpotState{
    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public boolean isOccupied() {
        return false;
    }

    @Override
    public boolean isReserved() {
        return false;
    }

    @Override
    public void assignVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setState(new Occupied());
    }

    @Override
    public void removeVehicle(ParkingSpot spot) {
        // nothing
    }
}
