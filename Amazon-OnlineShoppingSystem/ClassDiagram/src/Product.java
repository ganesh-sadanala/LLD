public class Product {
    String productID;
    String name;
    String description;
    double price;
    ProductCategory category;
    int availableItemCount;

    Account seller;

    public int getAvailableCount(){
        return -1;
    }
    public boolean updatePrice(double newPrice){
        return false;
    }
}
