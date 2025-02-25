package uvg.edu;

class ListFactory {
    public static <T> List<T> getList(String type) {
        return type.equals("simple") ? new SimpleLinkedList<>() : new DoubleLinkedList<>();
    }
}