package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Interface defining the basic operations of a List.
 */
interface IList<T> {
    /**
     * Adds an element to the List.
     *
     * @param item the element to add
     */
    void add(T item);

    /**
     * Removes and returns the element at the specified index.
     *
     * @param index the index of the element to remove
     * @return the removed element
     */
    T remove(int index);

    /**
     * Returns the element at the specified index.
     *
     * @param index the index of the element to return
     * @return the element at the specified index
     */
    T get(int index);

    /**
     * Checks if the List is empty.
     *
     * @return true if the List is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the List.
     *
     * @return the number of elements
     */
    int size();
}