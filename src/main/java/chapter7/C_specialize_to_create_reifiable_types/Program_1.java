package chapter7.C_specialize_to_create_reifiable_types;
import java.util.*;
public class Program_1 {
    public static void main(String[] args)  {
        ListString listString1 = new ListString(List.of("one", "two"));
        ListString listString2 = new ListString(List.of("seven", "eight"));
        List<? extends List<?>> lists =
                Arrays.asList(listString1, List.of(3, 4), List.of("five", "six"), listString2);
        ListString[] listStringArray = lists.stream()
                .filter(list -> list instanceof ListString)
                .toArray(ListString[]::new);
        assert Arrays.toString(listStringArray).equals("[[one, two], [seven, eight]]");

    }
}
