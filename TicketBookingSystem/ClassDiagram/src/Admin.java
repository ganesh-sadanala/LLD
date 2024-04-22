import java.util.List;

public class Admin extends Person{
    private String adminId;

    public Admin(String name, String email, String phone, String address, String adminId) {
        super(name, email, phone, address);
        this.adminId = adminId;
    }

    public boolean addMovie(Movie movie){
        return true;
    }

    public boolean addShow(MovieShow show){
        return true;
    }

    boolean updateShow(MovieShow show, int showId){
        return true;
    }

    boolean deleteShow(int showId){
        return true;
    }

    boolean deleteMovie(int movieId){
        return true;
    }
}
