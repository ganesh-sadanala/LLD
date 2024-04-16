public abstract class ParkingSpot {
    int id;
    boolean isFree;

    ParkingSpotState parkingSpotState;

    String type;

    public ParkingSpot(){
        parkingSpotState=new Available();
    }

    public boolean isFree() {
        return isFree;
    }

    public boolean isAvailable(){
        return parkingSpotState.isAvailable();
    }

    public boolean isOccupied(){
        return parkingSpotState.isOccupied();
    }

    public boolean isReserved(){
        return parkingSpotState.isReserved();
    }

    public void setState(ParkingSpotState parkingSpotState) {
        this.parkingSpotState = parkingSpotState;
    }

    private Vehicle vehicle;

    public boolean assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isFree=false;
        parkingSpotState.assignVehicle(this, vehicle);
        return true;
    }

    public boolean removeVehicle(Vehicle vehicle){
        this.vehicle=null;
        isFree=true;
        parkingSpotState.removeVehicle(this);
        return true;
    }


    public abstract String getType();

    public int getId() {
        return id;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
