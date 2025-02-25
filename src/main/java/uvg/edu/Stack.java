package uvg.edu;

interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}