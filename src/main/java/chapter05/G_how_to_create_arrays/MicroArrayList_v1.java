package chapter05.G_how_to_create_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MicroArrayList_v1<E>{
    private int size = 2;                   // test data
    private Object[] data = {"a", "b"};     // test data
    // ...
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        a = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
        System.arraycopy(data, 0, a, 0, size);
        return a;
    }
    public static void main(String[] args) {
        MicroArrayList_v1<String> mal = new MicroArrayList_v1<>();
        String[] arr = mal.toArray(args);
        System.out.println(Arrays.equals(arr, new String[]{"a", "b"}));
    }
}
