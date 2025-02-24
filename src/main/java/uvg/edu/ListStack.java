package uvg.edu;

public class ListStack<T> implements IStack<T> {
    private IListADT<T> list;

    public ListStack(IListADT<T> list) {
        this.list = list;
    }

    @Override
    public void push(T item) {
        list.add(item);
    }

    @Override
    public T pop() {
        return list.remove();
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Peek no implementado en esta lista");
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}