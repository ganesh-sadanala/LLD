public abstract class MembershipDecorator implements LibraryMember{
    LibraryMember libraryMember;

    public void borrowBook() {
        libraryMember.borrowBook();
    }

    public void returnBook() {
        libraryMember.returnBook();
    }
}
