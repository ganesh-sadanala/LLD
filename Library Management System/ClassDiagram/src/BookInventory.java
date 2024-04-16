import java.util.ArrayList;
import java.util.List;

public class BookInventory {
    List<BookObserver> observers=new ArrayList<>();

    private String bookTitle;
    private int availableCount;

    public BookInventory(String bookTitle, int availableCount) {
        this.bookTitle = bookTitle;
        this.availableCount = availableCount;
    }

    public void borrowBook() {
        if (availableCount > 0) {
            availableCount--;
            notifyObservers();
        }
    }

    public void returnBook() {
        availableCount++;
        notifyObservers();
    }

    public void registerObserver(BookObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BookObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BookObserver observer : observers) {
            observer.update(bookTitle, availableCount);
        }
    }

}
