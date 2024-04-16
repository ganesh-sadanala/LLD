public abstract class ProductDecorator extends Product{

    Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    public double getPrice(){
        return product.getPrice();
    }
}
