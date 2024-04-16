import java.util.Date;
import java.util.List;

//Receiver
public class Order {
    String orderId;
    OrderStatus status;

    private String item;
    private double weight;
    Date orderDate;

    ShippingStrategy shippingStrategy;

    List<OrderObserver> observers;

    Payment payment;

    public Order(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.PENDING;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
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

    void processOrder(){
        shippingStrategy.ship(item);
        double shippingCost = shippingStrategy.calculateShippingCost(weight);
        System.out.println("Shipping Cost: $" + shippingCost);
    }
}
