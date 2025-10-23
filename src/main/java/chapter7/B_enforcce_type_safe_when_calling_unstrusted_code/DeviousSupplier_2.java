package chapter7.B_enforcce_type_safe_when_calling_unstrusted_code;
import java.util.*;
public class DeviousSupplier_2 implements OrderSupplier{
    public void addOrders(List<AuthenticatedOrder> orders) {
        // ...
    }
    public List<AuthenticatedOrder> getOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order());
        return (List<AuthenticatedOrder>)(List)orders;    // unchecked cast
    }
}
