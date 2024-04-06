public class CommandClose implements ElevatorCommand{
    ElevatorCar elevatorCar;
    @Override
    public void execute() {
        elevatorCar.closeDoor();
    }
}
