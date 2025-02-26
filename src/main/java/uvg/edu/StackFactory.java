package uvg.edu;

class StackFactory {
    public static <T> Stack<T> getStack(String type, uvg.edu.List<T> list) { // Cambio aquí
        switch (type) {
            case "arraylist": return new ArrayListStack<>();
            case "vector": return new VectorStack<>();
            case "list": return new ListStack<>(list); // Ahora es compatible
            default: throw new IllegalArgumentException("Tipo de Stack no válido");
        }
    }
}
