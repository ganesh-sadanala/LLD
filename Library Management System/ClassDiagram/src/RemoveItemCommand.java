public class RemoveItemCommand implements LibraryCommand{
    LibraryManager libraryManager;
    String itemName;
    @Override
    public void execute() {
        libraryManager.removeItem(itemName);
    }

    @Override
    public void undo() {
        libraryManager.addItem(itemName);
    }

    @Override
    public void redo() {
        libraryManager.removeItem(itemName);
    }
}
