package chapter05.I_the_principle_of_incedent_exposure;
import java.util.List;
public class DeceptiveLibrary {
    public static List<Integer>[] createIntLists(int size) {
        List<Integer>[] intLists =
                (List<Integer>[]) new List[size];  // unchecked cast //1
        for (int i = 0; i < size; i++)
            intLists[i] = List.of(i+1);
        return intLists;
    }
}
class InnocentClient {
    public static void main(String[] args) {
        List<Integer>[] intLists = DeceptiveLibrary.createIntLists(1);
        List<? extends Number>[] numLists = intLists;
        numLists[0] = List.of(1.01);
        int i = intLists[0].get(0);           // class cast exception!
    }

}