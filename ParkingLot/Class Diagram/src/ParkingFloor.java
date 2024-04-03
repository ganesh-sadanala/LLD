import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingFloor {

        private String name;
        private HashMap<String, Large> largeSpots;
        private HashMap<String, Handicapped> handicappedSpots;
        private HashMap<String, Compact> compactSpots;
        private HashMap<String, MotorCycle> motorcycleSpots;
        private HashMap<String, Electric> electricSpots;

        private List<ParkingObserver> observers=new ArrayList<>();

        DisplayBoard parkingDisplayBoard;

        ParkingFloor(){

        }

        public void registerObserver(ParkingObserver parkingObserver){
            observers.add(parkingObserver);
        }

        public void removeObserver(ParkingObserver parkingObserver){
            observers.remove(parkingObserver);
        }

        public void assignVehicleToSpot(ParkingSpot spot, Vehicle vehicle){
            spot.assignVehicle(vehicle);
            notifyObservers(spot);
        }

        public void notifyObservers(ParkingSpot spot){
            for(ParkingObserver parkingObserver: observers) parkingObserver.updateDisplayBoard(spot);
        }
}
