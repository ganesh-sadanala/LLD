import java.util.List;

public class UserDecorator implements User{
    User user;

    UserDecorator(User user){
        this.user=user;
    }

    @Override
    public void search(Question q) {

    }

    @Override
    public void view(Question q) {

    }

    @Override
    public List<String> getPrivileges() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
