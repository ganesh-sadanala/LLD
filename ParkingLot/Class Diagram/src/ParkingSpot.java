public abstract class ParkingSpot {
    int id;
    boolean isFree;

    public boolean isFree() {
        return isFree;
    }

    private Vehicle vehicle;

    public boolean assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        isFree=false;
    }

    public boolean removeVehicle(Vehicle vehicle){
        this.vehicle=null;
        isFree=true;
    }
}
