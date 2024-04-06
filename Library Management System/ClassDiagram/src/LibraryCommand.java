public interface LibraryCommand {
    void execute();
    void undo();

    void redo();
}
