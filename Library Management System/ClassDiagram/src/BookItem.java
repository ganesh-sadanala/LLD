import java.util.Date;

public class BookItem extends Book{
    boolean isReferenceOnly;
    Date borrowed;
    Date dueDate;
    double price;
    BookFormat format;
    BookStatus status;
    Date dateOfPurchase;
    Rack placedAt;
}
