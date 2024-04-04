public class DiscountDecorator extends ProductDecorator{
    private double discountPercentage;

    public DiscountDecorator(Product product){
        super(product);
    }

    public double getPrice() {
        return product.getPrice() * (1 - discountPercentage / 100);
    }
}
