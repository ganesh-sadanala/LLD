public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String type, String... details){
        if (type.equalsIgnoreCase("book")) {
            String title = details[0];
            String author = details[1];
            return new Book(title, author);
        } else if (type.equalsIgnoreCase("magazine")) {
            String name = details[0];
            String issue = details[1];
            return new Magazine(name, issue);
        } else if (type.equalsIgnoreCase("dvd")) {
            String title = details[0];
            String director = details[1];
            return new DVD(title, director);
        }
        throw new IllegalArgumentException("Invalid library item type: " + type);
    }
}
