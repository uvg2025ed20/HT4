package uvg.edu;

class ListStack<T> extends AbstractStack<T> {
    private uvg.edu.List<T> list;

    public ListStack(uvg.edu.List<T> list) {
        this.list = list;
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() { 
        return list.isEmpty() ? null : list.remove(list.size() - 1); // Corrección aquí
    }

    public T peek() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
