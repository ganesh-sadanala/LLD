public class OrderTrackingSystem implements OrderObserver{
    @Override
    public void update(Order order) {
        System.out.println("Order Tracking System: Order " + order.orderId + " status changed to " + order.status);
    }
}
