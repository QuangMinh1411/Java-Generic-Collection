package chapter7.A_eliminate_unchecked_warnings;

import java.util.*;

public class Promote_2 {
    public static List<String> promote(List<Object> objs) {
        for (Object o : objs)
            if (!(o instanceof String))
                throw new ClassCastException();
        @SuppressWarnings("unchecked") // this cast is typesafe because the code can be
        // reached only if all the list elements are Strings
        List<String> strings = (List<String>) (List<?>) objs;
        return strings;
    }
}
