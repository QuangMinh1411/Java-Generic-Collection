package chapter05.B_instance_tests_and_casts;

import java.util.Collection;
import java.util.List;

public class Program2 {
    public static <T>List<T> asList(Collection<T> cl){
        return cl instanceof List<T> ? (List<T>)cl : cl.stream().toList();
    }
}
