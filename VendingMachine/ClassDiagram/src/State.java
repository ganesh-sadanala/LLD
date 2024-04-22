public interface State {
    void insertMoney(int money);
    void dispenseProduct(int rackNumber);
    void pressButton(int rackNumber);
    void returnChange(int money);
    void updateInventory(int rackNumber);

    void refundFullMoney(int money);
}
