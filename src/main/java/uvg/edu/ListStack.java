package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Stack implementation using a List.
 */
class ListStack<T> extends AbstractStack<T> {
    private IList<T> list;

    /**
     * Constructs a ListStack with the specified list.
     *
     * @param list the list to use as the underlying data structure
     */
    public ListStack(IList<T> list) {
        this.list = list;
    }

    @Override
    public void push(T item) {
        list.add(item);
    }

    @Override
    public T pop() {
        return list.isEmpty() ? null : list.remove(list.size() - 1);
    }

    @Override
    public T peek() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
