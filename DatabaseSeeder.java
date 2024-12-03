import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import java.util.logging.Logger;

@Singleton
@Startup
public class DatabaseSeeder {
    private static final Logger logger = Logger.getLogger(DatabaseSeeder.class.getName());

    @jakarta.inject.Inject
    private PersonService personService;

    @jakarta.inject.Inject
    private ProductService productService;

    @jakarta.inject.Inject
    private OrderService orderService;

    @PostConstruct
    public void seedDatabase() {
        // Seed Person data
        Person person = new Person();
        person.setId(1L);
        person.setName("John Doe");
        person.setAge(30);
        personService.create(person);

        // Seed Product data
        Product product = new Product();
        product.setId(101L);
        product.setName("Laptop");
        product.setPrice(75000);
        productService.create(product);

        // Log seeded data
        logger.info("Database seeded with sample data.");
    }
}
