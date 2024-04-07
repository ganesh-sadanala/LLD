import java.util.List;

public interface User {
    void search(Question q);
    void view(Question q);

    List<String> getPrivileges();
    String getDescription();
}
