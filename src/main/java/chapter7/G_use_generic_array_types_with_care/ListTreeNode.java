package chapter7.G_use_generic_array_types_with_care;
import java.util.*;
public class ListTreeNode <T>{
    private T data;
    private final List<ListTreeNode<T>> children;
    public ListTreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }
    public void addChild(ListTreeNode<T> child) { this.children.add(child); }
    public void removeChild(ListTreeNode<T> child) { this.children.remove(child); }
    public T getData() { return data; }
    public List<ListTreeNode<T>> getChildren() { return children; }
}
