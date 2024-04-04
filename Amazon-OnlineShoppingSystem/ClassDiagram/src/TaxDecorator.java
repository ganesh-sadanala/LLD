public class TaxDecorator extends ProductDecorator{
    private double taxPercentage;

    public TaxDecorator(Product product){
        super(product);
    }

    public double getPrice() {
        return product.getPrice() * (1 + taxPercentage / 100);
    }
}
