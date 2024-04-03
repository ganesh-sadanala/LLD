import java.util.HashMap;

public class ParkingFloor {
    class ParkingFloor{

        private String name;
        private HashMap<String, Large> largeSpots;
        private HashMap<String, Handicapped> handicappedSpots;
        private HashMap<String, Compact> compactSpots;
        private HashMap<String, MotorCycle> motorcycleSpots;
        private HashMap<String, Electric> electricSpots;

        DisplayBoard parkingDisplayBoard;

        ParkingFloor(){

        }

        public void assignVehicleToSpot(ParkingSpot spot, Vehicle vehicle){
            spot.assignVehicle(vehicle);
            switch(spot.getType()){
                case ParkingSpotType.HANDICAPPED: updateDisplayBoardForHandicapped(spot);

                    // ...
            }
        }

        public void updateDisplayBoardForHandicapped(ParkingSpot spot){
            if(this.parkingDisplayBoard.handiCappedSpot == spot.getId()){
                // Find available spot:
                // Use Two HashMaps one for available and other for occuped to achieve in O(1) space

            }
        }

        // .. others



    }
}
