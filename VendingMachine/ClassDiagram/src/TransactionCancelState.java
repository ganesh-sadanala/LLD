public class TransactionCancelState implements State{
    VendingMachine vendingMachine;

    TransactionCancelState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void insertMoney(int money) {

    }

    @Override
    public void dispenseProduct(int rackNumber) {

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
