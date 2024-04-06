public class CommandOpen implements ElevatorCommand{
    ElevatorCar elevatorCar;
    @Override
    public void execute() {
        elevatorCar.openDoor();
    }
}
