package chapter03.G_bridges.example_3_6;

interface Comparable {
    public int compareTo(Object other);
}
//record Point(double x, double y) implements Comparable {  // fails compilation
//
//    public int compareTo(Point p) {
//        return Double.compare(this.x * this.x + this.y * this.y,
//                p.x * p.x + p.y * p.y);
//    }


//}
