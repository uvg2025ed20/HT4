package uvg.edu;

/**
 * Integrantes:
 * - Pablo Vásquez
 * - Carlos López
 * - Angel Sanabria
 *
 * Factory class for creating instances of different List types.
 */
class ListFactoryImp {
    /**
     * Gets an instance of List based on the specified type.
     *
     * @param type the type of List to create ("simple", "double")
     * @return an instance of List
     */
    public static <T> IList<T> getList(String type) {
        return type.equals("simple") ? new LinkListSimp<>() : new LinkListDoub<>();
    }
}