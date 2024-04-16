public class RemoveItemCommand implements LibraryCommand{
    LibraryManager libraryManager;
    String itemName;

    RemoveItemCommand(LibraryManager libraryManager, String itemName){
        this.libraryManager=libraryManager;
        this.itemName=itemName;
    }
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
