public class FloorController {
    int floor;
    ElevatorMediator mediator;

    public void requestElevator() {
        System.out.println("Floor " + floor + " requesting elevator.");
        mediator.handleFloorRequest(floor);
    }

    public void notifyElevatorArrival() {
        System.out.println("Floor " + floor + " notified of elevator arrival.");
    }

    public int getFloor() {
        return floor;
    }
}
