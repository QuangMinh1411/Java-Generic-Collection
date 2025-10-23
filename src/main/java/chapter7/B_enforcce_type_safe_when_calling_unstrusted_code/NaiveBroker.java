package chapter7.B_enforcce_type_safe_when_calling_unstrusted_code;
import java.util.*;
public class NaiveBroker {
    public void connect(OrderSupplier supplier, OrderProcessor processor) {
        List<AuthenticatedOrder> orders = new ArrayList<>();
        supplier.addOrders(orders);
        processor.processOrders(orders);
    }
}
