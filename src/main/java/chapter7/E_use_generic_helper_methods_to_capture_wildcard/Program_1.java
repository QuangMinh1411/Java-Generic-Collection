package chapter7.E_use_generic_helper_methods_to_capture_wildcard;
import java.util.*;
public class Program_1 {
    public static void reverse(List<?> list) {
//        List<Object> tmp = new ArrayList<>(list);
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, tmp.get(list.size()-i-1));  // compile-time error
//        }
    }
}
