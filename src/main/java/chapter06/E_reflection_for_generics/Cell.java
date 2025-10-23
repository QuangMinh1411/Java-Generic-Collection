package chapter06.E_reflection_for_generics;

public class Cell<E> {
    private E value;
    public Cell(E value) { this.value=value; }
    public E getValue() { return value; }
    public void setValue(E value) { this.value=value; }
    public static <T> Cell<T> copy(Cell<T> cell) {
        return new Cell<T>(cell.getValue());
    }
}
