package chapter01.C_primitive_and_reference_types;

import java.util.List;

public class Program_6 {
    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) { s += n; }
        return s;
    }
}
