package chapter03.D_comparator;

import java.util.Comparator;

public class Program_3 {
    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return (o1, o2) -> o1.compareTo(o2);
    }

    public static void main(String[] args) {
        Comparator<Integer> comp = naturalOrder();
        assert comp.compare(1, 2) < 0;
    }
}
