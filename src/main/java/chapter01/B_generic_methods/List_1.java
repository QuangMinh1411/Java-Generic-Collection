package chapter01.B_generic_methods;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr) list.add(elt);
        return list;
    }

    public static void main(String[] args)  {
        List<Integer> ints = List_1.toList(new Integer[] {1, 2, 3});
        List<String> words = List_1.toList(new String[] { "Hello", "world!" });
        ints.forEach(System.out::println);
        words.forEach(System.out::println);
    }
}
