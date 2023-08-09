import java.util.Date;

public class BookLending {
    String itemId;
    Date creationDate;
    Date dueDate;
    String memberId;

    Date returnDate;

    public static void lendBook(String barcode, String memberId){}

    public static BookLending fetchLendingDetails(String barcode){
        return null;
    }

    public Date getReturnDate() {
        return returnDate;
    }
}
