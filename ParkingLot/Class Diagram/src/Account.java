public abstract class Account {
    String userName;
    String password;
    AccountStatus status;
    Person person;

    public boolean resetPassword(){
        return true;
    }
}
