import java.util.ArrayList;
import java.util.List;

public class LibraryManager {

    List<String> items=new ArrayList<>();

    void addItem(String itemName){
        items.add(itemName);
        System.out.println("Added item: " + itemName);
    }

    void removeItem(String itemName){
        items.remove(itemName);
        System.out.println("Removed item: " + itemName);
    }
}
