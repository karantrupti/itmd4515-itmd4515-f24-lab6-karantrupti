import jakarta.ejb.Stateless;

@Stateless
public class ProductService extends AbstractService<Product> {
    public ProductService() {
        super(Product.class);
    }
}
