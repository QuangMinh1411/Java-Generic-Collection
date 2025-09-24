package chapter03.B_maximum_of_a_collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

public class Program_2 {
    public static <T extends Comparable<T>> Optional<T> max(Collection<T> coll) {
        return coll.stream().max(Comparator.naturalOrder());
    }
}
