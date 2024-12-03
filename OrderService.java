import jakarta.ejb.Stateless;

@Stateless
public class OrderService extends AbstractService<Order> {
    public OrderService() {
        super(Order.class);
    }
}
