package chapter02.E_get_and_put;

import java.util.List;

public class Program_8 {
    public static void main(String[] args)  {
        List<Object> objs = List.of(1,"two");
        List<? super Integer> ints = objs;
        String str = "";
        for (Object obj : ints) str += obj.toString();
        assert str.equals("1two");

    }
}
