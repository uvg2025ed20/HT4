package uvg.edu;

    import java.util.LinkedList;

    /**
     * Integrantes:
     * - Pablo Vásquez
     * - Carlos López
     * - Angel Sanabria
     *
     * A simple linked list implementation of the IList interface.
     *
     * @param <T> the type of elements in this list
     */
    class LinkListSimp<T> implements IList<T> {
        private LinkedList<T> list = new LinkedList<>();

        /**
         * Adds an item to the end of the list.
         *
         * @param item the item to be added
         */
        @Override
        public void add(T item) {
            list.add(item);
        }

        /**
         * Removes the item at the specified position in the list.
         *
         * @param index the index of the item to be removed
         * @return the removed item
         */
        @Override
        public T remove(int index) {
            return list.remove(index);
        }

        /**
         * Returns the item at the specified position in the list.
         *
         * @param index the index of the item to be returned
         * @return the item at the specified position in the list
         */
        @Override
        public T get(int index) {
            return list.get(index);
        }

        /**
         * Tests if the list is empty.
         *
         * @return true if the list contains no items; false otherwise
         */
        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        /**
         * Returns the number of items in the list.
         *
         * @return the number of items in the list
         */
        @Override
        public int size() {
            return list.size();
        }
    }