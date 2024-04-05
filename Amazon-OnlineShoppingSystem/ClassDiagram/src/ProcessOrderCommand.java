
// Concrete command
public class ProcessOrderCommand implements OrderCommand{

    private Order order;

    ProcessOrderCommand(Order order){
        this.order=order;
    }
    @Override
    public void execute() {

    }
}
