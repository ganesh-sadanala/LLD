public class ElevatorCar {
    int id;
    int currentFloor;
    Door door;
    ElevatorState elevatorState;
    ElevatorPanel elevatorPanel;
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

    public void stop() {
        elevatorState = ElevatorState.Idle;
    }
}
