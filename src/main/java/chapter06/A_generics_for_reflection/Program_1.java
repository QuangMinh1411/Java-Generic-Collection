package chapter06.A_generics_for_reflection;

public class Program_1 {
    public static void main(String[] args)  {
        Class<Integer> ki = Integer.class;
        Number n = Integer.valueOf(42);
        Class<? extends Number> kn = n.getClass();
        assert ki == kn;
        System.out.println(ki==kn);
    }
}
