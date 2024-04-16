public class CommandUp implements ElevatorCommand{
    HallPanel hallPanel;

    @Override
    public void execute() {
        hallPanel.up();
    }
}
