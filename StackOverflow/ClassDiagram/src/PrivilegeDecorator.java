import java.util.ArrayList;
import java.util.List;

public class PrivilegeDecorator extends UserDecorator{
    private String privilege;

    public PrivilegeDecorator(User user, String privilege) {
        super(user);
        this.privilege = privilege;
    }

    @Override
    public List<String> getPrivileges() {
        List<String> privileges = new ArrayList<>(user.getPrivileges());
        privileges.add(privilege);
        return privileges;
    }
}
