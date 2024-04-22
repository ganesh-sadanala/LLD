import java.util.List;
import java.util.PriorityQueue;

// Shortest Seek Time First algorithm
// Greedy
// May cause starvation
public class SSTF implements SchedulingStrategy{

    List<Integer> requestedFloors;
    // Bruteforce
    public int selectNextFloor(int currentFloor) {
        if (!requestedFloors.isEmpty()) {
            int nearestFloor = requestedFloors.get(0);
            int minDistance = Math.abs(nearestFloor - currentFloor);
            for (int floor : requestedFloors) {
                int distance = Math.abs(floor - currentFloor);
                if (distance < minDistance) {
                    nearestFloor = floor;
                    minDistance = distance;
                }
            }
            return nearestFloor;
        }
        return currentFloor;
    }



    // Optimization, tradeoff: extra space(everytime create new Heap)
    public void requestFloor(int floor) {
        requestedFloors.add(floor);
    }

    private int currentFloor;
    private PriorityQueue<Integer> requestedFloors;

    public SSTF() {
        this.currentFloor = 1;
        this.requestedFloors = new PriorityQueue<>(
                (a, b) -> Math.abs(a - currentFloor) - Math.abs(b - currentFloor)
        );
    }

    @Override
    public void processRequests() {
        while (!requestedFloors.isEmpty()) {
            int nextFloor = requestedFloors.remove();
            moveToFloor(nextFloor);
            currentFloor = nextFloor;

            // Update the priorities of the remaining floors in the min-heap
            PriorityQueue<Integer> updatedFloors = new PriorityQueue<>(
                    (a, b) -> Math.abs(a - currentFloor) - Math.abs(b - currentFloor)
            );
            updatedFloors.addAll(requestedFloors);
            requestedFloors = updatedFloors;
        }
    }

    private void moveToFloor(int floor) {
        System.out.println("Elevator moving from floor " + currentFloor + " to floor " + floor);
    }
}
