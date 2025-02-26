package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Abstract class providing a skeletal implementation of the Stack interface.
 *
 * @param <T> the type of elements in this stack
 */
abstract class AbstractStack<T> implements IStack<T> {

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item the item to be pushed onto this stack
     */
    @Override
    public abstract void push(T item);

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     * @return the object at the top of this stack, or null if this stack is empty
     */
    @Override
    public abstract T pop();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @return the object at the top of this stack, or null if this stack is empty
     */
    @Override
    public abstract T peek();

    /**
     * Tests if this stack is empty.
     *
     * @return true if and only if this stack contains no items; false otherwise
     */
    @Override
    public abstract boolean isEmpty();
}