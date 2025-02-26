package uvg.edu;

import java.util.ArrayList;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Stack implementation using an ArrayList.
 */
class ArrayListStack<T> extends AbstractStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        return stack.isEmpty() ? null : stack.remove(stack.size() - 1);
    }

    @Override
    public T peek() {
        return stack.isEmpty() ? null : stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}