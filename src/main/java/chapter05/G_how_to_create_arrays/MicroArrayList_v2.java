package chapter05.G_how_to_create_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MicroArrayList_v2<E> {
    private int size = 2;                   // test data
    private Object[] data = {"a", "b"};     // test data
    // ...
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(Class<T> clazz) {
        T[] a = (T[]) Array.newInstance(clazz, size);
        System.arraycopy(data, 0, a, 0, size);
        return a;
    }
    public static void main(String[] args) {
        MicroArrayList_v2<String> mal = new MicroArrayList_v2<>();
        String[] arr = mal.toArray(String.class);
        System.out.println(Arrays.equals(arr, new String[]{"a", "b"}));
    }

}
