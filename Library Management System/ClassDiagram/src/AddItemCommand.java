public class AddItemCommand implements LibraryCommand{

    LibraryManager libraryManager;
    private String itemName;

    AddItemCommand(LibraryManager libraryManager, String itemName){
        this.libraryManager=libraryManager;
        this.itemName=itemName;
    }

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
