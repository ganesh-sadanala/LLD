public class Display {
    int floor;
    int capacity;
    Direction direction;
    public void showElevatorDisplay(){
        System.out.println("Floor: " + floor);
        System.out.println("Capacity: " + capacity);
        System.out.println("Direction: " + direction);
    }

    public void showHallDisplay(){
        System.out.println("Floor: " + floor);
        System.out.println("Direction: " + direction);
    }

}
