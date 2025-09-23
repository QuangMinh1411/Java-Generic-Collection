package chapter02.E_get_and_put;

import java.util.Collection;
import java.util.List;

public class Program_2 {
    public static double sum(Collection<? extends Number> nums) {
        return nums.stream().mapToDouble(Number::doubleValue).sum();
    }
    public static void main(String[] args)  {
        List<Integer> ints = List.of(1, 2, 3);
        assert sum(ints) == 6.0;
        List<Double> doubles = List.of(2.5, 3.5);
        assert sum(doubles) == 6.0;
        List<Number> nums = List.of(1, 2, 2.5, 3.5);
        assert sum(nums) == 9.0;

    }
}
