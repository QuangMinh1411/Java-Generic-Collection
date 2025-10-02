package chapter05.B_instance_tests_and_casts;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        System.out.println(x instanceof List<? extends Number>);
    }
}
