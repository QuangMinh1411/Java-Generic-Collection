package chapter7.B_enforcce_type_safe_when_calling_unstrusted_code;
import java.util.*;
public class WaryBroker_1 {
    public void connect(OrderSupplier supplier, OrderProcessor processor) {
        List<AuthenticatedOrder> orders = new ArrayList<AuthenticatedOrder>();
        supplier.addOrders(Collections.checkedList(orders, AuthenticatedOrder.class));
        processor.processOrders(orders);
    }
}
