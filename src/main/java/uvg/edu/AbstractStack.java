package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Abstract class providing a skeletal implementation of the Stack interface.
 */
abstract class AbstractStack<T> implements Stack<T> {
    @Override
    public abstract void push(T item);

    @Override
    public abstract T pop();

    @Override
    public abstract T peek();

    @Override
    public abstract boolean isEmpty();
}