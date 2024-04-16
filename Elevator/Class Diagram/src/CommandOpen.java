public class CommandOpen implements ElevatorCommand{
    ElevatorCar elevatorCar;

    CommandOpen(ElevatorCar elevatorCar){
        this.elevatorCar=elevatorCar;
    }
    @Override
    public void execute() {
        elevatorCar.openDoor();
    }
}
