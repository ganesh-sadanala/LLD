public abstract class ParkingSpot {
    int id;
    boolean isFree;

    String type;

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
        return true;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }
}
