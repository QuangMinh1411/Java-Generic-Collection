package chapter02.I_restrictions_on_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static <T> List<T> factory() { return new ArrayList<T>(); }

    public static void main(String[] args)  {
        List<?> list1 = Lists.factory();
        List<?> list2 = Lists.<Object>factory();

//        List<?> list3 = Lists.<?>factory();  // compile-time error

        List<List<?>> list4 = Lists.<List<?>>factory();  // ok

    }
}
