public class DispenseItemState implements State{
    VendingMachine vendingMachine;

    DispenseItemState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Money cannot be inserted in this state.");
    }

    @Override
    public void dispenseProduct(int rackNumber) {
        Rack rack = vendingMachine.getRack(rackNumber);
        if (!rack.isEmpty()) {
            Product product = vendingMachine.getInventory().getProduct(rack.getProductId());
            System.out.println("Dispensing product: " + product.getName());
            vendingMachine.updateInventory(rackNumber);
            vendingMachine.setCurrentState(vendingMachine.getDispenseChangeState());
            vendingMachine.returnChange(vendingMachine.getCurrentBalance() - product.getPrice());
        } else {
            System.out.println("Selected rack is empty.");
            vendingMachine.setCurrentState(new ReadyState(vendingMachine));
        }
    }


    @Override
    public void pressButton(int rackNumber) {

    }

    @Override
    public void returnChange(int money) {

    }

    @Override
    public void updateInventory(int rackNumber) {

    }

    @Override
    public void refundFullMoney(int money) {

    }
}
