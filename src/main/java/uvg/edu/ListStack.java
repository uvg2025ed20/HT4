package uvg.edu;

import java.util.List;

class ListStack<T> extends AbstractStack<T> {
    private List<T> list;
    public ListStack(List<T> list) { this.list = list; }
    public void push(T item) { list.add(item); }
    public T pop() { return list.isEmpty() ? null : list.remove(list.size() - 1); }
    public T peek() { return list.isEmpty() ? null : list.get(list.size() - 1); }
    public boolean isEmpty() { return list.isEmpty(); }
}