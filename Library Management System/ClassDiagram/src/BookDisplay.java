public class BookDisplay implements BookObserver{

    private String displayName;

    public BookDisplay(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public void update(String bookTitle, int availableCount) {
        System.out.println(displayName + " - Book: " + bookTitle + ", Available: " + availableCount);
    }
}
