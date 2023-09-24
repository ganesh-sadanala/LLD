import java.util.List;

public class Cinema {

    private int cinemaId;
    private City city;
    private List<Hall> hallList;

    public Cinema(int cinemaId, City city, List<Hall> hallList) {
        this.cinemaId = cinemaId;
        this.city = city;
        this.hallList = hallList;
    }
}
