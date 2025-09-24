package chapter03.F_multiple_bounds;

public interface IoeThrowingSupplier <S>{
    S get() throws Exception;
}
