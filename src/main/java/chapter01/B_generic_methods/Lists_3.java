package chapter01.B_generic_methods;

import java.util.ArrayList;
import java.util.List;

public class Lists_3 {
    public static <T> void addAll(List<T> list, T... arr) {
        for (T elt : arr) list.add(elt);
    }
    public static void main(String[] args)  {
        List<Integer> ints = new ArrayList<Integer>();
        Lists_3.addAll(ints, 1, 2);
        Lists_3.addAll(ints, new Integer[] { 3, 4 });
        assert ints.equals(List.of(1, 2, 3, 4));

    }
}
