public class CommandUp implements ElevatorCommand{
    ElevatorCar elevatorCar;
    @Override
    public void execute() {
        elevatorCar.moveUp();
    }
}
