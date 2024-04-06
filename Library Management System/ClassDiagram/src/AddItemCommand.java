public class AddItemCommand implements LibraryCommand{

    LibraryManager libraryManager;
    private String itemName;

    @Override
    public void execute() {
        libraryManager.addItem(itemName);
    }

    @Override
    public void undo() {
        libraryManager.removeItem(itemName);
    }

    @Override
    public void redo() {
        libraryManager.addItem(itemName);
    }
}
