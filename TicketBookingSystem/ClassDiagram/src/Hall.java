import java.util.List;

public class Hall {
    private String hallId;
    private List<MovieShow> showTimeList;

   public Hall(String hallId, List<MovieShow> showTimeList) {
        this.hallId = hallId;
        this.showTimeList = showTimeList;
   }
}
