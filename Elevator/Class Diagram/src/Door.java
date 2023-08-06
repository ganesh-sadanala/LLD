public class Door {
    DoorState state;
    public Door() {
        state = DoorState.Close;
    }
    public void open() {
        state = DoorState.Open;
    }
    public void close() {
        state = DoorState.Close;
    }
    public DoorState getState() {
        return state;
    }
}
