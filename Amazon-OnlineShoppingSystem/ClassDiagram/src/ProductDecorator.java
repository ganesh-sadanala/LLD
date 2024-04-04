public abstract class ProductDecorator extends Product{

    Product product;
    ProductDecorator(Product product){
        this.product=product;
    }

    public double getPrice(){
        return product.getPrice();
    }
}
