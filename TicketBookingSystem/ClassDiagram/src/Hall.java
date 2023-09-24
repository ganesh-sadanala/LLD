import java.util.List;

public class Hall {
    private String hallId;
    private List<ShowTime> showTimeList;

   public Hall(String hallId, List<ShowTime> showTimeList) {
        this.hallId = hallId;
        this.showTimeList = showTimeList;
    }
}
