import java.util.List;
import java.util.Map;

public class Catalog implements Search{
    Map<String, List<Movie>> movieTitles;
    Map<String, List<Movie>> movieLanguages;
    Map<String, List<Movie>> movieGenres;
    Map<String, List<Movie>> movieReleaseDates;

    boolean updateMovieCatalog(Movie movie) {
        return false;
    }

    @Override
    public List<Movie> searchMovieByTitle(String title) {
        return null;
    }

    @Override
    public List<Movie> searchMovieByLanguage(String language) {
        return null;
    }

    @Override
    public List<Movie> searchMovieByGenre(String genre) {
        return null;
    }

    @Override
    public List<Movie> searchMovieByReleaseDate(String relDate) {
        return null;
    }
}
