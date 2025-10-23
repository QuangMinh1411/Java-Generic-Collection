package chapter7.B_enforcce_type_safe_when_calling_unstrusted_code;
import java.util.List;
public class WaryBroker_2 {
    public void connect(OrderSupplier supplier, OrderProcessor processor) {
        List<AuthenticatedOrder> orders = supplier.getOrders();
        for (AuthenticatedOrder order : orders) {}
    }
}
