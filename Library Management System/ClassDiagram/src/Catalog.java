import java.util.Date;
import java.util.List;

public class Catalog implements Search {
    private String []bookTitles;
    private String []bookAuthors;
    private String []bookSubjects;
    private Date[]bookPublicationDates;


    @Override
    public List<BookItem> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<BookItem> searchByAuthor(String author) {
        return null;
    }

    @Override
    public List<BookItem> searchBySubject(String subject) {
        return null;
    }

    @Override
    public List<BookItem> searchByPubDate(Date publishDate) {
        return null;
    }
}
