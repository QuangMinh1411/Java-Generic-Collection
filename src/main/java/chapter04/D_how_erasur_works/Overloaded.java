package chapter04.D_how_erasur_works;

//public class Overloaded implements Comparable<Integer>,Comparable<Long>{
//    // compile-time error, cannot implement two interfaces with same erasure
//    private int value;
//    // ...
//    public int compareTo(Integer i) {
//        return (value < i.value) ? -1 : (value == i.value) ? 0 : 1;
//    }
//    public int compareTo(Long l) {
//        return (value < l.intValue()) ? -1 : (value == l.intValue()) ? 0 : 1;
//    }
//}
