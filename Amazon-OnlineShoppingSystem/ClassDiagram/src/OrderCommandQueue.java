import java.util.LinkedList;
import java.util.Queue;


// Invoker
public class OrderCommandQueue {
    private Queue<OrderCommand> queue=new LinkedList<>();

    public void addCommand(OrderCommand command) {
        queue.add(command);
    }

    public void processCommands() {
        while (!queue.isEmpty()) {
            OrderCommand command = queue.poll();
            command.execute();
        }
    }
}
