public class ReadyState implements State{
    VendingMachine vendingMachine;

    ReadyState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Money inserted ");
        vendingMachine.setState(new MoneyInsertedState());
    }

    @Override
    public void dispenseProduct(int rackNumber) {
        System.out.println("Product cannot be dispensed in this state.");
    }

    @Override
    public void pressButton(int rackNumber) {
        System.out.println("No money inserted. Please insert money first.");
    }

    @Override
    public void returnChange(int money) {
        System.out.println("No change to return in this state.");
    }

    @Override
    public void updateInventory(int rackNumber) {
        System.out.println("Inventory cannot be updated in this state.");
    }

    @Override
    public void refundFullMoney(int money) {
        System.out.println("No money to refund in this state.");
    }
}
