import java.util.List;

public interface SchedulingStrategy {
    List<Integer> requestedFloors;
    int selectNextFloor(int currentFloor);

    void processRequests();

     void requestFloor(int floor);
}
