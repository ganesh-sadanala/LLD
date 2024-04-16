public class DiscountDecorator extends ProductDecorator{
    private double discountPercentage;

    public DiscountDecorator(Product product, double discountPercentage){
        super(product);
        this.discountPercentage=discountPercentage;
    }

    public double getPrice() {
        return product.getPrice() * (1 - discountPercentage / 100);
    }
}
