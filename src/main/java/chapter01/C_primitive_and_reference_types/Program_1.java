package chapter01.C_primitive_and_reference_types;

import java.util.ArrayList;
import java.util.List;

public class Program_1 {
    public static void main(String[] args)  {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        int n = ints.getFirst();
        System.out.println(n);
    }
}
