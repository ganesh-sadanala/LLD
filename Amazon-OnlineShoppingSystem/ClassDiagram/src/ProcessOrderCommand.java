
// Concrete command
public class ProcessOrderCommand implements OrderCommand{

    private Order order;

    ProcessOrderCommand(Order order){
        this.order=order;
    }
    @Override
    public void execute() {
        // Process the order
        System.out.println("Processing order: " + order.getOrderId());
        System.out.println("Amount: $" + order.getAmount());
        // Additional order processing logic...
    }
}
