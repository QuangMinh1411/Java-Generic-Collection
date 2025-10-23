package chapter7.F_cast_through_raw_types;
import java.util.*;
public class Program_1 {@SuppressWarnings({"rawtypes", "unchecked"})
public static void reverse(List<?> list) {
    List tmp = new ArrayList(list);             // Unchecked call to ArrayList::new
    for (int i = 0; i < list.size(); i++) {
        ((List) list).set(i, tmp.get(list.size()-i-1)); // Unchecked call to set
    }
}
}
