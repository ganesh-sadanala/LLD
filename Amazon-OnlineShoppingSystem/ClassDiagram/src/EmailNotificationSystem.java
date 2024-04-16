public class EmailNotificationSystem implements OrderObserver{
    @Override
    public void update(Order order) {
        System.out.println("Email Notification System: Order " + order.orderId + " status changed to " + order.status);
    }
}
