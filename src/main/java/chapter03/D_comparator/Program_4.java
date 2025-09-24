package chapter03.D_comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program_4 {
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        return Collections.max(coll, Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(5, 6,1,3,9);
        System.out.println(Program_4.max(ints));
    }
}
