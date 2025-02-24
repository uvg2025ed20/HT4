package uvg.edu;

public interface IListADT<T> {
    void add(T item);
    T remove();
    boolean isEmpty();
}
