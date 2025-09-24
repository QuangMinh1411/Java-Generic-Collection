package chapter03.A_comparable;

public record Event_3(String name, int millisecs) implements Comparable<Event_3> {
    @Override
    public int compareTo(Event_3 other) {
        return Integer.compare(this.millisecs, other.millisecs);
    }
}
