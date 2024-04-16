import java.util.ArrayList;
import java.util.List;

// Invoker
public class ElevatorButton extends Button{
    int destinationFloorNum;

    List<ElevatorCommand> commands=new ArrayList<>();

    public void press(ElevatorCommand elevatorCommand){
        elevatorCommand.execute();
        commands.add(elevatorCommand);
    }
}
