package chapter03.D_comparator;

import java.util.Comparator;

record Event(String name, int millisecs) implements Comparable<Event> {
    private static final Comparator<Event> eventComparator =
            Comparator.comparingInt(Event::millisecs);
    public int compareTo(Event other) {
        return eventComparator.compare(this, other);
    }

}
