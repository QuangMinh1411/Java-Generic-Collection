package chapter02.I_restrictions_on_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Program_2 {
    public static void main(String[] args)  {
        List<Number> nums = new ArrayList<Number>();
        List<? super Number> sink = nums;
        List<? extends Number> source = nums;
        for (int i=0; i<5; i++) sink.add(i);
        int sum = source.stream().mapToInt(Number::intValue).sum();
        assert sum == 10;

    }
}
