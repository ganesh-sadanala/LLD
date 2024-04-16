public class Magazine implements LibraryItem{

    private String name;
    private String issue;
    // Other magazine-specific properties

    public Magazine(String name, String issue) {
        this.name = name;
        this.issue = issue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + name + ", Issue: " + issue);
    }
}
