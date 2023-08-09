import java.util.Date;

public class BookReservation{
    String itemId;
    Date creationDate;
    ReservationStatus status;
    String memberId;

    public static void fetchReservationDetails(String reservationId){}

    public ReservationStatus getStatus() {
        return status;
    }
}
