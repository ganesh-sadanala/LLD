import java.util.Date;

public abstract class Notification {
    private int notificationId;
    private String content;
    private Date timestamp;

    public boolean sendNotification(Person person) {
        return false;
    }
}
