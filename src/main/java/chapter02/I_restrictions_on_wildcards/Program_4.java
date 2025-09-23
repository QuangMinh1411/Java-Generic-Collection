package chapter02.I_restrictions_on_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Program_4 {
    public static void main(String[] args)  {
        List<?> list1 = new ArrayList<Object>();   // ok
//        List<?> list2 = new List<Object>(); // compile-time error
//        List<?> list3 = new ArrayList<?>(); // compile-time error

    }
}
