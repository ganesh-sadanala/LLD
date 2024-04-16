public class CommandClose implements ElevatorCommand{
    ElevatorCar elevatorCar;

    CommandClose(ElevatorCar elevatorCar){
        this.elevatorCar=elevatorCar;
    }
    @Override
    public void execute() {
        elevatorCar.closeDoor();
    }
}
