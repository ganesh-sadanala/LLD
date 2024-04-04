import java.util.Date;
import java.util.List;

public class Order {
    String orderId;
    OrderStatus status;
    Date orderDate;

    List<OrderObserver> observers;

    public Order(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.PENDING;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(OrderStatus status){
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }
}
