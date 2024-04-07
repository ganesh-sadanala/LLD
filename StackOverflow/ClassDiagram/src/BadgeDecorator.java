public class BadgeDecorator extends UserDecorator{

    Badge badge;
    BadgeDecorator(User user, Badge badge){
        super(user);
        this.badge=badge;
    }

    @Override
    public String getDescription() {
        return user.getDescription() + ", Badge: " + badge;
    }
}
