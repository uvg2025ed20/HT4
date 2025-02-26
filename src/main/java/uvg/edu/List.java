package uvg.edu;

interface List<T> {
    void add(T item);
    T remove(int index);
    T get(int index);
    boolean isEmpty();
    int size(); // Agregar este método
}
