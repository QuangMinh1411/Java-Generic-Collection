package chapter02.F_arrays;

import java.util.Arrays;
import java.util.List;

public class Program_3 {
    public static void main(String[] args)  {
        List<Integer> ints = Arrays.asList(0);
        List<? extends Number> nums = ints;
//        nums.set(0, 3.14);  // compile-time error

    }
}
