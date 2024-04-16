public class BasicMembership implements LibraryMember{
    @Override
    public void borrowBook() {
        System.out.println("Borrowing a book as a basic member.");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book as a basic member.");
    }
}
