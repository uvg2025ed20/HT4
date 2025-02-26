package uvg.edu;

import java.util.LinkedList;

class SimpleLinkedList<T> implements List<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void add(T item) { list.add(item); }

    public T remove(int index) { return list.remove(index); }

    public T get(int index) { return list.get(index); }

    public boolean isEmpty() { return list.isEmpty(); }

    public int size() { return list.size(); } // Implementación del método size()
}
