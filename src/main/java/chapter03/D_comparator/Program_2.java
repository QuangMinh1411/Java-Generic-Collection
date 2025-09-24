package chapter03.D_comparator;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Program_2 {
    public static <T extends Comparable<T>> T max(Collection<T> coll, Comparator<? super T> comp) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();
        while (i.hasNext()) {
            T next = i.next();
            if (comp.compare(next, candidate) > 0)
                candidate = next;
        }
        return candidate;
    }
}
