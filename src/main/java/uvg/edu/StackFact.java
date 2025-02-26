package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Factory class for creating instances of different Stack types.
 */
class StackFact {
    /**
     * Gets an instance of Stack based on the specified type.
     *
     * @param type the type of Stack to create ("arraylist", "vector", "list")
     * @param list the list to use in case of a list-based Stack
     * @return an instance of Stack
     * @throws IllegalArgumentException if the Stack type is invalid
     */
    public static <T> IStack<T> getStack(String type, IList<T> list) {
        switch (type) {
            case "arraylist": return new ArrayListStack<>();
            case "vector": return new StackVec<>();
            case "list": return new ListStack<>(list);
            default: throw new IllegalArgumentException("Invalid Stack type");
        }
    }
}