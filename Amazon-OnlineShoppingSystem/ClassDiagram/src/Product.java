public class Product {
    int productID;
    String name;
    String description;
    double price;
    String category;
    String priceRange;
    int availableItemCount;

    public Product(int id, String name, String category, String priceRange) {
        productID = id;
        this.name = name;
        this.category = category;
        this.priceRange = priceRange;
    }

    Account seller;

    public int getAvailableCount(){
        return -1;
    }
    public boolean updatePrice(double newPrice){
        return false;
    }
}
