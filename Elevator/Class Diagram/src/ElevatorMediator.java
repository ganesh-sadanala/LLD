public interface ElevatorMediator {
    void registerFloorController(FloorController floorController);
    void registerElevatorCar(ElevatorCar elevatorCar);
    void handleFloorRequest(int floor);
    void handleElevatorArrival(int floor);
}
