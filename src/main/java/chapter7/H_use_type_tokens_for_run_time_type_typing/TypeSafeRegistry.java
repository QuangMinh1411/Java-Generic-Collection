package chapter7.H_use_type_tokens_for_run_time_type_typing;
import java.util.*;
public class TypeSafeRegistry {
    private Map<Class<?>,List<?>> typeSafeRegistry = new HashMap<>();
    public <T> void addObject(Class<T> type, T object) {
        getObjects(type).add(object);
    }
    @SuppressWarnings("unchecked")
    public <T> List<T> getObjects(Class<T> type) {
        List<?> untypedList = typeSafeRegistry.computeIfAbsent(type, k -> new ArrayList<>());
        return (List<T>) untypedList;               // unchecked cast
    }
}
