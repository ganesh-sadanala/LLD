import java.util.List;

public class City {
    String name;
    String state;
    int zipCode;
    List<Cinema> cinemaList;

    public City(String name, String state, int zipCode, List<Cinema> cinemaList) {
        this.name = name;
        this.state = state;
        this.zipCode = zipCode;
        this.cinemaList = cinemaList;
    }
}
