package uvg.edu;

            /**
             * A doubly linked list implementation of the IList interface.
             *
             * @param <T> the type of elements in this list
             */
            public class LinkListDoub<T> implements IList<T> {
                private Node<T> head;
                private Node<T> tail;
                private int size;

                /**
                 * Node class represents each element in the doubly linked list.
                 *
                 * @param <T> the type of elements in the node
                 */
                private static class Node<T> {
                    T data;
                    Node<T> next;
                    Node<T> prev;

                    /**
                     * Constructs a new node with the specified data.
                     *
                     * @param data the data to be stored in the node
                     */
                    Node(T data) {
                        this.data = data;
                        this.next = null;
                        this.prev = null;
                    }
                }

                /**
                 * Adds an item to the end of the list.
                 *
                 * @param item the item to be added
                 */
                @Override
                public void add(T item) {
                    Node<T> newNode = new Node<>(item);
                    if (tail == null) {
                        head = tail = newNode;
                    } else {
                        tail.next = newNode;
                        newNode.prev = tail;
                        tail = newNode;
                    }
                    size++;
                }

                /**
                 * Removes the item at the specified position in the list.
                 *
                 * @param index the index of the item to be removed
                 * @return the removed item
                 * @throws IndexOutOfBoundsException if the index is out of range
                 */
                @Override
                public T remove(int index) {
                    if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
                    Node<T> current;
                    if (index == 0) {
                        current = head;
                        head = head.next;
                        if (head != null) head.prev = null;
                    } else if (index == size - 1) {
                        current = tail;
                        tail = tail.prev;
                        if (tail != null) tail.next = null;
                    } else {
                        current = head;
                        for (int i = 0; i < index; i++) {
                            current = current.next;
                        }
                        current.prev.next = current.next;
                        if (current.next != null) current.next.prev = current.prev;
                    }
                    size--;
                    return current.data;
                }

                /**
                 * Returns the item at the specified position in the list.
                 *
                 * @param index the index of the item to be returned
                 * @return the item at the specified position in the list
                 * @throws IndexOutOfBoundsException if the index is out of range
                 */
                @Override
                public T get(int index) {
                    if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
                    Node<T> current = head;
                    for (int i = 0; i < index; i++) {
                        current = current.next;
                    }
                    return current.data;
                }

                /**
                 * Tests if the list is empty.
                 *
                 * @return true if the list contains no items; false otherwise
                 */
                @Override
                public boolean isEmpty() {
                    return size == 0;
                }

                /**
                 *
                 * @return the number of items in the list
                 */
                @Override
                public int size() {
                    return size;
                }
            }