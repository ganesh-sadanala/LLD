import java.util.List;

public interface SchedulingStrategy {
    int selectNextFloor(int currentFloor, List<Integer> requestedFloors);
}
