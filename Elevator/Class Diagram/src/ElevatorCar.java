public class ElevatorCar {

    State state;
    int id;
    int currentFloor;
    Door door;
    ElevatorState elevatorState;
    ElevatorPanel elevatorPanel;

    ElevatorCommand elevatorCommand;

    boolean available;

    ElevatorMediator mediator;
    Display display;

    public void openDoor() {
        door.open();
    }

    public void closeDoor() {
        door.close();
    }

    public void move() {
        if (elevatorState == ElevatorState.Up) {
            currentFloor++;
        } else if (elevatorState == ElevatorState.Down) {
            currentFloor--;
        }
    }

    public void moveToFloor(int floor) {
        System.out.println("Elevator moving from floor " + currentFloor + " to floor " + floor);
        currentFloor = floor;
        available = false;
        // Simulate elevator movement
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        available = true;
        mediator.handleElevatorArrival(floor);
    }


    public void stop() {
        elevatorState = ElevatorState.Idle;
    }

    void moveUp(){}
    void moveDown(){}
    void idle(){}
}
