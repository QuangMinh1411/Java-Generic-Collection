package chapter02.E_get_and_put;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program_4 {
    public static void storeIntegers(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) s += num.doubleValue();
        return s;
    }
    public static double sumValues(Collection<Number> nums, int n) {
        storeIntegers(nums, n);
        return sum(nums);
    }
    public static void main(String[] args)  {
        List<Number> nums2 = new ArrayList<>();
        double sum = sumValues(nums2, 5);
        assert sum == 10;

    }
}
