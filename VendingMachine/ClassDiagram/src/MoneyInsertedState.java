public class MoneyInsertedState implements State{

    VendingMachine vendingMachine;

    MoneyInsertedState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        vendingMachine.setMoney(vendingMachine.getMoney()+money);
    }

    @Override
    public void dispenseProduct(int rackNumber) {
        System.out.println("Product cannot be dispensed in this state.");
    }

    @Override
    public void pressButton(int rackNumber) {
        Rack rack = vendingMachine.getRack(rackNumber);
        if (!rack.isEmpty()) {
            Product product = vendingMachine.getInventory().getProduct(rack.getProductId());
            if (vendingMachine.getCurrentBalance() >= product.getPrice()) {
                vendingMachine.setCurrentState(new DispenseItemState(vendingMachine));
                vendingMachine.dispenseProduct(rackNumber);
            } else {
                System.out.println("Insufficient balance. Please insert more money.");
            }
        } else {
            System.out.println("Selected rack is empty.");
        }
    }

    @Override
    public void returnChange(int money) {
        System.out.println("Change cannot be returned in this state.");
    }

    @Override
    public void updateInventory(int rackNumber) {
        System.out.println("Inventory cannot be updated in this state.");
    }

    @Override
    public void refundFullMoney(int money) {
        vendingMachine.setCurrentBalance(0);
        vendingMachine.setCurrentState(vendingMachine.getReadyState());
        System.out.println("Refunding full money: $" + money);
    }
}
