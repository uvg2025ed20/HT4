package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Stack implementation using a List.
 *
 * @param <T> the type of elements in this stack
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

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack
     */
    @Override
    public void push(T item) {
        list.add(item);
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return the object at the top of this stack, or null if this stack is empty
     */
    @Override
    public T pop() {
        return list.isEmpty() ? null : list.remove(list.size() - 1);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of this stack, or null if this stack is empty
     */
    @Override
    public T peek() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}