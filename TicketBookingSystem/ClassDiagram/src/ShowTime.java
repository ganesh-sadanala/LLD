import java.util.List;

public class ShowTime {
    private String showId;
    private String showTime;
    private int duration;
    private String showDate;
    private List<Seat> seatList;

    public ShowTime(String showId, String showTime, int duration, String showDate, List<Seat> seatList) {
        this.showId = showId;
        this.showTime = showTime;
        this.duration = duration;
        this.showDate = showDate;
        this.seatList = seatList;
    }
}

