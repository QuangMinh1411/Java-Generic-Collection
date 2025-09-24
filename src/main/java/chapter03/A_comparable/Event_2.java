package chapter03.A_comparable;

public record Event_2(String name,int millisecs) implements Comparable<Event_2> {
    @Override
    public int compareTo(Event_2 o) {
        return this.millisecs-o.millisecs;
    }
}
