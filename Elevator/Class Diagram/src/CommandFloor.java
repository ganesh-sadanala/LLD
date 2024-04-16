public class CommandFloor implements ElevatorCommand{
    ElevatorCar elevatorCar;
    int floor;

    public CommandFloor(ElevatorCar elevator, int floor) {
        elevatorCar = elevator;
        this.floor = floor;
    }


    @Override
    public void execute() {
        elevatorCar.moveToFloor(floor);
    }
}
