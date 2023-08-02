public class ParkingLot {
    int id;
    String name;
    String address;
    boolean addEntrance(Entrance entrance){
        return true;
    }
    boolean addExit(Exit exit){
        return true;
    }
    ParkingTicket getParkingTicket(){
        return null;
    }
    boolean isFull(){
        return true;
    }
}
