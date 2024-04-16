public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String paymentMethod = "paypal";
        double amount = 100.0;

        PaymentGateway paymentGateway = PaymentGatewayFactory.createPaymentGateway(paymentMethod);
        paymentGateway.processPayment(amount);

        Order order = new Order("ORD-1234");
        OrderTrackingSystem trackingSystem = new OrderTrackingSystem();
        EmailNotificationSystem emailSystem = new EmailNotificationSystem();

        order.attach(trackingSystem);
        order.attach(emailSystem);

        order.setStatus(OrderStatus.PROCESSING);
        order.setStatus(OrderStatus.SHIPPED);

        order.detach(emailSystem);

        order.setStatus(OrderStatus.DELIVERED);

        Product product = new ConcreteProduct("Shirt", 50.0);
        System.out.println("Original Product: " + product.getName() + ", Price: $" + product.getPrice());

        // Apply discount
        product = new DiscountDecorator(product, 10);
        System.out.println("After Discount: " + product.getName() + ", Price: $" + product.getPrice());

        // Apply tax
        product = new TaxDecorator(product, 8);
        System.out.println("After Tax: " + product.getName() + ", Price: $" + product.getPrice());

        Order order = new Order("T-Shirt", 1.5);

        // Set Standard Shipping Strategy
        order.setShippingStrategy(new StandardShipping());
        order.processOrder();

        System.out.println("---");

        // Set Express Shipping Strategy
        order.setShippingStrategy(new ExpressShipping());
        order.processOrder();

        System.out.println("---");

        // Set International Shipping Strategy
        order.setShippingStrategy(new InternationalShipping());
        order.processOrder();

        OrderCommandQueue commandQueue = new OrderCommandQueue();

        // Create orders
        Order order1 = new Order("ORD-001", 100.0);
        Order order2 = new Order("ORD-002", 200.0);
        Order order3 = new Order("ORD-003", 150.0);

        // Create command objects for each order
        OrderCommand command1 = new ProcessOrderCommand(order1);
        OrderCommand command2 = new ProcessOrderCommand(order2);
        OrderCommand command3 = new ProcessOrderCommand(order3);

        // Add commands to the command queue
        commandQueue.addCommand(command1);
        commandQueue.addCommand(command2);
        commandQueue.addCommand(command3);

        // Process the commands in the queue
        commandQueue.processCommands();
    }
}