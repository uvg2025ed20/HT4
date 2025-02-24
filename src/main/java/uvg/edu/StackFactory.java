package uvg.edu;

public class StackFactory {
    public static <T> Stack<T> getStack(String type) {
        if (type.equalsIgnoreCase("simplelist")) {
            return new ListStack<>(new SimpleLinkedList<>());
        } else if (type.equalsIgnoreCase("doublelist")) {
            return new ListStack<>(new DoublyLinkedList<>());

        } else if (type.equalsIgnoreCase("vector")) {
            return new VectorStack<>();
        }
        return null;
    }
}