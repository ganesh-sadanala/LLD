public abstract class MembershipDecorator implements LibraryMember{
    LibraryMember libraryMember;

    MembershipDecorator(LibraryMember member){
        libraryMember=member;
    }

    public void borrowBook() {
        libraryMember.borrowBook();
    }

    public void returnBook() {
        libraryMember.returnBook();
    }
}
