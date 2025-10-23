package chapter7.B_enforcce_type_safe_when_calling_unstrusted_code;

import java.util.*;

public class DeviousSupplier_1 {
    public void addOrders(List<AuthenticatedOrder> orders) {
        List raw = orders;
        Order order = new Order(); // not authenticated
        raw.add(order);            // unchecked call
    }
//    public List<AuthenticatedOrder> getOrders() {
//        // ...
//    }
}
