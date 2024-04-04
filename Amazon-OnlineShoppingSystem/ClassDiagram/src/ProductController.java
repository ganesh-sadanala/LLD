import java.util.List;

public class ProductController {
    private ProductRepository productRepository;
    private ProductCatalogView productCatalogView;

    public ProductController(ProductRepository productRepository, ProductCatalogView productCatalogView) {
        this.productRepository = productRepository;
        this.productCatalogView = productCatalogView;
    }

    public void viewProductCatalog() {
        List<Product> products = productRepository.getAllProducts();
        productCatalogView.displayProducts(products);
    }
}
