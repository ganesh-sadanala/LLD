public class CommandDown implements ElevatorCommand{
    HallPanel hallPanel;
    @Override
    public void execute() {
        hallPanel.moveDown();
    }
}
