package uvg.edu;

    import java.util.Vector;

    /**
     * \brief StackVec is a stack implementation using a Vector.
     *
     * \tparam <T> the type of elements in this stack
     *
     * \author Pablo Vásquez
     * \author Carlos López
     * \author Angel Sanabria
     */
    class StackVec<T> extends AbstractStack<T> {
        private Vector<T> stack = new Vector<>();

        /**
         * \brief Pushes an item onto the top of this stack.
         *
         * \param item the item to be pushed onto this stack
         */
        @Override
        public void push(T item) {
            stack.add(item);
        }

        /**
         * \brief Removes the object at the top of this stack and returns that object as the value of this function.
         *
         * \return the object at the top of this stack, or null if this stack is empty
         */
        @Override
        public T pop() {
            return stack.isEmpty() ? null : stack.remove(stack.size() - 1);
        }

        /**
         * \brief Looks at the object at the top of this stack without removing it from the stack.
         *
         * \return the object at the top of this stack, or null if this stack is empty
         */
        @Override
        public T peek() {
            return stack.isEmpty() ? null : stack.get(stack.size() - 1);
        }

        /**
         * \brief Tests if this stack is empty.
         *
         * \return true if and only if this stack contains no items; false otherwise
         */
        @Override
        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }