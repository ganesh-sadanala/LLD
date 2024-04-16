public class DVD implements LibraryItem{
    private String title;
    private String director;
    // Other DVD-specific properties

    public DVD(String title, String director) {
        this.title = title;
        this.director = director;
    }
    @Override
    public void displayInfo() {
        System.out.println("DVD: " + title + " directed by " + director);
    }
}
