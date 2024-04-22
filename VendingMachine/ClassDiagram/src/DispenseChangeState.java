public class DispenseChangeState implements State{

    VendingMachine vendingMachine;

    DispenseChangeState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Money cannot be inserted in this state.");
    }

    @Override
    public void dispenseProduct(int rackNumber) {
        System.out.println("Product cannot be dispensed in this state.");
    }

    @Override
    public void pressButton(int rackNumber) {
        System.out.println("Button cannot be pressed in this state.");
    }

    @Override
    public void returnChange(int money) {
        System.out.println("Returning change: $" + money);
        vendingMachine.setState(new ReadyState(vendingMachine));
    }

    @Override
    public void updateInventory(int rackNumber) {
        System.out.println("Inventory cannot be updated in this state.");
    }

    @Override
    public void refundFullMoney(int money) {
        System.out.println("Full money cannot be refunded in this state.");
    }
}
