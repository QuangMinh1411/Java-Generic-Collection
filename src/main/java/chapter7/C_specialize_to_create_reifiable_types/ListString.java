package chapter7.C_specialize_to_create_reifiable_types;

import java.util.AbstractList;
import java.util.*;
public class ListString extends AbstractList<String>implements List<String> {
    private final List<String> list;
    public ListString() { this.list = new ArrayList<>(); }
    public ListString(Collection<? extends String> c) { this.list = new ArrayList<>(c); }
    public ListString(int capacity) { this.list = new ArrayList<>(capacity); }
    public int size() { return list.size(); }
    public String get(int i) { return list.get(i); }
    public String set(int i, String s) { return list.set(i,s); }
    public String remove(int i) { return list.remove(i); }
    public void add(int i, String s) { list.add(i,s); }
}
