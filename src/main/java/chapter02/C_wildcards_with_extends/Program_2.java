package chapter02.C_wildcards_with_extends;

import java.util.ArrayList;
import java.util.List;

public class Program_2 {
    public static void main(String[] args)  {
        List<Integer> ints = new ArrayList<>();
        List<? extends Number> nums = ints;  //  now legal
//        nums.add(3.14);                      //  can't be allowed

    }
}
