public class GoldCardMembership extends MembershipDecorator{

    GoldCardMembership(LibraryMember member){
        super(member);
    }
    @Override
    public void borrowBook() {
        System.out.println("Borrowing a book as a gold member.");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book as a gold member.");
    }
}
