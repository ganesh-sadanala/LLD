public interface ParkingSpotState {
    boolean isAvailable();
    boolean isOccupied();
    boolean isReserved();

    public void assignVehicle(ParkingSpot parkingSpot, Vehicle vehicle);

    public void removeVehicle(ParkingSpot spot);
}
