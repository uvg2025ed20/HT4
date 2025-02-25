package uvg.edu;

import java.util.List;

class StackFactory {
    public static <T> Stack<T> getStack(String type, List<T> list) {
        switch (type) {
            case "arraylist": return new ArrayListStack<>();
            case "vector": return new VectorStack<>();
            case "list": return new ListStack<>(list);
            default: throw new IllegalArgumentException("Tipo de Stack no válido");
        }
    }
}