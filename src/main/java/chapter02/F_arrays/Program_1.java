package chapter02.F_arrays;

public class Program_1 {
    public static void main(String[] args)  {
        Integer[] ints = {0};
        Number[] nums = ints;
        nums[0] = 3.14;         // array store exception (subtype of RuntimeException)

    }
}
