package chapter06.D_a_generic_reflection_library;

import java.util.*;
import java.util.Collection;

public class Program1 {
    public static <T, C extends Collection<T>> C copy(C coll) {
        try {
            C copy = GenericReflection.newInstance(coll);
            copy.addAll(coll);
            return copy;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args)  {
        List<Integer> coll = new ArrayList<>(List.of(1, 2, 3));
        assert copy(coll).equals(coll);
        assert copy(coll).getClass().equals(coll.getClass());

    }
}
