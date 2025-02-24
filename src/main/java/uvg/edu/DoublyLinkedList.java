package uvg.edu;

public class DoublyLinkedList<T> implements IListADT<T> {
    private static class Node<T> {
        T data;
        Node<T> next, prev;
        Node(T data) { this.data = data; }
    }

    private Node<T> head, tail;
    
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
    }

    @Override
    public T remove() {
        if (tail == null) return null;
        T data = tail.data;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        return data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
