import java.util.List;

// Shortest Seek Time First algorithm
// Greedy
// May cause starvation
public class SSTF implements SchedulingStrategy{


    // Bruteforce
    public int selectNextFloor(int currentFloor, List<Integer> requestedFloors) {
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



    // optimized but tradeoff: extra space(everytime create new Heap)
    public void requestFloor(int floor) {
        requestedFloors.offer(floor);
    }

    private int currentFloor;
    private PriorityQueue<Integer> requestedFloors;

    public Elevator() {
        this.currentFloor = 1;
        this.requestedFloors = new PriorityQueue<>(
                (a, b) -> Math.abs(a - currentFloor) - Math.abs(b - currentFloor)
        );
    }
    public void processRequests() {
        while (!requestedFloors.isEmpty()) {
            int nextFloor = requestedFloors.poll();
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



}
