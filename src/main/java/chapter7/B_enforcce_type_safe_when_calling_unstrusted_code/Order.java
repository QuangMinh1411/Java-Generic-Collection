package chapter7.B_enforcce_type_safe_when_calling_unstrusted_code;

import java.util.*;

public class Order {
}
class AuthenticatedOrder extends Order {}

interface OrderSupplier {
    public void addOrders(List<AuthenticatedOrder> orders);
    public List<AuthenticatedOrder> getOrders();
}
interface OrderProcessor {
    public void processOrders(List<? extends Order> orders);

}
