package chapter02.I_restrictions_on_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Program_3 {
    public static void main(String[] args)  {
        List<List<?>> lists = new ArrayList<List<?>>();
        lists.add(List.of(1,2,3));
        lists.add(List.of("four","five"));
        assert lists.equals(List.of(List.of(1, 2, 3), List.of("four", "five")));
        assert lists.getFirst().getFirst().toString().equals("1");

    }
}
