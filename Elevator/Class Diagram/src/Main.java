public class Main {
    public static void main(String[] args) {
        ElevatorCar elevator = new ElevatorCar();
        ElevatorButton button = new ElevatorButton();

        // Floor requests
        ElevatorCommand floorRequest1 = new CommandFloor(elevator, 5);
        ElevatorCommand floorRequest2 = new CommandFloor(elevator, 2);


        // Press buttons
        button.press(floorRequest1);
        button.press(floorRequest2);


    }
}
