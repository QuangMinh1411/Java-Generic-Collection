package chapter02.F_arrays;

import java.util.Collection;

public class Program_4 {
    public static void storeIntegers(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }
}
