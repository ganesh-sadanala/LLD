public abstract class Customer {
    private ShoppingCart cart;
    private Order order;
    public ShoppingCart getShoppingCart(){
        return cart;
    }
    public boolean addItemToCart(Item item){
        return false;
    }
    public boolean removeItemFromCart(Item item){
        return false;
    }
}
