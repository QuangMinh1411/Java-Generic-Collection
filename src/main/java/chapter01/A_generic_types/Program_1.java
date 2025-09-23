package chapter01.A_generic_types;

import java.util.ArrayList;
import java.util.List;

public class Program_1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0)+words.get(1);
        assert s.equals("Hello world!");
    }
}
