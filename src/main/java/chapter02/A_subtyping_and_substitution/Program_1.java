package chapter02.A_subtyping_and_substitution;

import java.util.ArrayList;
import java.util.List;

public class Program_1 {
    public static void main(String[] args)  {
        List<Number> nums = new ArrayList<>();
        nums.add(2);
        nums.add(0.25);
        assert nums.equals(List.of(2, 0.25));

    }
}
