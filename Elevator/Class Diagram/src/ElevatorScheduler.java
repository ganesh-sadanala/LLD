import java.util.List;

public class ElevatorScheduler implements ElevatorMediator{

    List<FloorController> floorControllers;
    List<ElevatorCar> elevatorCars;

    public ElevatorScheduler() {
        floorControllers = new ArrayList<>();
        elevatorCars = new ArrayList<>();
    }

    @Override
    public void registerFloorController(FloorController floorController) {
        floorControllers.add(floorController);
    }

    @Override
    public void registerElevatorCar(ElevatorCar elevatorCar) {
        elevatorCars.add(elevatorCar);
    }

    @Override
    public void handleFloorRequest(int floor) {
        // Find the nearest available elevator car
        ElevatorCar nearestCar = findNearestAvailableCar(floor);
        if (nearestCar != null) {
            nearestCar.moveToFloor(floor);
        }
    }

    @Override
    public void handleElevatorArrival(int floor) {

    }

    private ElevatorCar findNearestAvailableCar(int floor) {
        ElevatorCar nearestCar = null;
        int minDistance = Integer.MAX_VALUE;
        for (ElevatorCar car : elevatorCars) {
            if (car.isAvailable()) {
                int distance = Math.abs(car.getCurrentFloor() - floor);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestCar = car;
                }
            }
        }
        return nearestCar;
    }
}
