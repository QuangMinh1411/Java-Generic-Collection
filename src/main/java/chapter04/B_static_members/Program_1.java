package chapter04.B_static_members;

import java.util.Arrays;
import java.util.List;

public class Program_1 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        List<String> strings = Arrays.asList("one","two");
        System.out.println(ints.getClass() + " " + strings.getClass());
    }
}
