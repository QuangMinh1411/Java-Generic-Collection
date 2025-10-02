package chapter05.B_instance_tests_and_casts;
import java.util.List;
import java.util.Collection;

public class Program_3 {
    public static <T> List<T> asList(Collection<T> cl){
        return cl instanceof List<T> q ? q:cl.stream().toList();
    }
}
