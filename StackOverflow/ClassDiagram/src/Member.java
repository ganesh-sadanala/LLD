import java.util.List;

public class Member implements User{
    List<Badge> badgesEarned;


    void post(Question q){}
    void addAnswer(Question q){}
    void upvote(Question q){}
    void comment(Question q){}
    void flag(Question q){}
    void addTags(Question q, Tag g){}
    void addBounty(Question q){}
    void voteTodelete(Question q){}

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
