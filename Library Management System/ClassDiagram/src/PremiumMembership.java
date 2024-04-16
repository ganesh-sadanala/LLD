public class PremiumMembership extends MembershipDecorator{

    PremiumMembership(LibraryMember member){
        super(member);
    }

    @Override
    public void borrowBook() {
        System.out.println("Borrowing a book as a premium member.");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book as a Premium member.");
    }
}
