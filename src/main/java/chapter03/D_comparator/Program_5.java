package chapter03.D_comparator;

import java.util.Comparator;
import java.util.function.Function;

public class Program_5 {
    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor) {
        return (c1, c2) ->
                keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
    }
}
