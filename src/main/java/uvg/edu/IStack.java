package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Interface defining the basic operations of a Stack.
 */
interface IStack<T> {
    /**
     * Adds an element to the Stack.
     *
     * @param item the element to add
     */
    void push(T item);

    /**
     * Removes and returns the top element of the Stack.
     *
     * @return the top element
     */
    T pop();

    /**
     * Returns the top element of the Stack without removing it.
     *
     * @return the top element
     */
    T peek();

    /**
     * Checks if the Stack is empty.
     *
     * @return true if the Stack is empty, false otherwise
     */
    boolean isEmpty();
}