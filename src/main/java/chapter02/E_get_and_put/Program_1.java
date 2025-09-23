package chapter02.E_get_and_put;

import java.util.Collection;

public class Program_1 {
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums) s += num.doubleValue();
        return s;
    }
}
