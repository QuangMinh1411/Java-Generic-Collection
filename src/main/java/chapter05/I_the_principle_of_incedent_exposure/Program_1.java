package chapter05.I_the_principle_of_incedent_exposure;

public class Program_1 {
    public static void main(String[] args)  {
        Integer[] ints = {0};
        Number[] nums = ints;
        nums[0] = 3.14;  // array store exception
        int n = ints[0];

    }
}
