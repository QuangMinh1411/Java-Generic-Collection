package chapter7.E_use_generic_helper_methods_to_capture_wildcard;
import java.util.*;
public class Program_2 {
    public static <T> void reverse(List<T> list) {
        List <T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size()-i-1));
        }
    }
}
