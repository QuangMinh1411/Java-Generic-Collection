package chapter05.C_exception_handling;

class IntegerException extends Exception {
    private final int value;
    public IntegerException(int value) { this.value = value; }
    public int getValue() { return value; }
}
public class IntegerExceptionTest {
    public static void main(String[] args) {
        try{
            throw new IntegerException(42);
        }catch (IntegerException e){
            System.out.println(e.getValue()==42);
        }
    }

}
