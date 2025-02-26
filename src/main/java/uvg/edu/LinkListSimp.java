package uvg.edu;

import java.util.LinkedList;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * A simple linked list implementation of the List interface.
 */
class LinkListSimp<T> implements IList<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove(int index) {
        return list.remove(index);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}