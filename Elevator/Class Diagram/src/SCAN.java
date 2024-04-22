import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class SCAN implements SchedulingStrategy{

    private Direction currentDirection;

    int currentFloor;

    int totalFloors;

    PriorityQueue<Integer> requestedFloors;

    SCAN(int initialFloor, int totalFloors){
        requestedFloors=new PriorityQueue<>();
        this.currentDirection=Direction.Up;
        this.totalFloors=totalFloors;
        this.currentFloor=initialFloor;
    }

    @Override
    public void requestFloor(int floor) {
        requestedFloors.add(floor);
    }

    @Override
    public int selectNextFloor(int currentFloor) {
        return 0;
    }

    @Override
    public void processRequests(){
        while(!requestedFloors.isEmpty()){
            if(currentDirection.equals(Direction.Up)){
                processUpRequests();
                currentDirection=Direction.Down;
            }else{
                processDownRequests();
                currentDirection=Direction.Up;
            }
        }
    }

    public void processUpRequests(){
        while(!requestedFloors.isEmpty() && requestedFloors.peek() >= currentFloor){
            currentFloor = requestedFloors.poll();

        }
    }

    public void processDownRequests(){

    }
}
