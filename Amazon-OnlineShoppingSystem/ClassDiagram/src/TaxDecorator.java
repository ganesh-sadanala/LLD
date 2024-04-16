public class TaxDecorator extends ProductDecorator{
    private double taxPercentage;

    public TaxDecorator(Product product, double taxPercentage){
        super(product);
        this.taxPercentage=taxPercentage;
    }

    public double getPrice() {
        return product.getPrice() * (1 + taxPercentage / 100);
    }
}
