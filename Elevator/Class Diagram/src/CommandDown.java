public class CommandDown implements ElevatorCommand{
    HallPanel hallPanel;

    CommandDown(HallPanel hallPanel){
        this.hallPanel=hallPanel;
    }
    @Override
    public void execute() {
        hallPanel.down();
    }
}
