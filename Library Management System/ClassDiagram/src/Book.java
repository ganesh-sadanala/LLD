import java.util.Date;

public class Book implements LibraryItem{
    private String title;
    private Author []author;
    private Date publicationDate;
    private String isbn;
    private String language;
    private BookFormat bookFormat;
    private int numOfPages;
    private String subject;
    private String publisher;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}
