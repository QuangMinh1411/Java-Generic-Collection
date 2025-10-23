package chapter7.H_use_type_tokens_for_run_time_type_typing;

import chapter7.G_use_generic_array_types_with_care.ArrayTreeNode;

import java.lang.reflect.Constructor;

public class Program_1 {
    public static <T> T createInstanceParameterized(Class<T> clazz) {
        try {
            Constructor<T> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
    public static Object createInstanceWildcard(Class<?> clazz) {
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args)  {
        class Foo {};
        Foo f1 = createInstanceParameterized(Foo.class);
        Foo f2 = (Foo) createInstanceWildcard(Foo.class);

    }
}
