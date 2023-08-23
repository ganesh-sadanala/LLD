import java.util.List;

public class VendingMachine {
    private State state;
    private int money;
    private int noOfRacks;
    private List<Rack> racks;
    private List<Integer> availableRacks;

    public void insertMoney(double money){
        state.insertMoney();
    }

    public void pressButton(int rackNumber){
        state.pressButton(rackNumber);
    }

    public void returnChange(int money){
        state.returnChange(money);
    }

    public void dispenseProduct(int rackNumber){
        state.dispenseProduct(rackNumber);
    }

    public void updateInventory(int rackNumber){
        state.updateInventory(rackNumber);
    }

    public int getProductIdAtRack(int rackNumber){
        return racks.get(rackNumber).getProductId();
    }

    public void refundFullMoney(){
        returnChange(money);
    }
}
