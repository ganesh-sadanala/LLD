public class DisplayBoard implements ParkingObserver{
    int id;
    Handicapped handicappedSpot;
    Compact compactSpot;
    Large largeSpot;
    MCSpot motorCycleSpot;

    public void showEmptySpotNumber(){
        if(handicappedSpot.isFree){

        }else{

        }
        // ...
    }

    public void updateDisplayBoard(ParkingSpot parkingSpot) {
        switch(parkingSpot.getType()){
            // Find available spot:
            // Use Two HashMaps one for available and other for occuped to achieve in O(1) space

        }
        showEmptySpotNumber();
    }
}
