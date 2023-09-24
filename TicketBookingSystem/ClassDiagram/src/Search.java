import java.util.List;

public interface Search {
    List<Movie> searchMovieByTitle(String title);
    List<Movie> searchMovieByLanguage(String language);
    List<Movie> searchMovieByGenre(String genre);
    List<Movie> searchMovieByReleaseDate(String relDate);

}
