package chapter06.B_reflected_types_are_reifiable_types;
import java.util.ArrayList;
import java.util.List;
public class Program_2 {
    public static void main(String[] args)  {
        List<Integer> ints = new ArrayList<Integer>();
        Class<? extends List> k = ints.getClass();
        assert k == ArrayList.class;

    }
}
