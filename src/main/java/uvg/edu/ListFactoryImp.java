package uvg.edu;

public class ListFactoryImp {
    public static <T> IList<T> getList(String type) {
        if ("simple".equals(type)) {
            return new LinkListSimp<>();
        } else if ("double".equals(type)) {
            return new LinkListDoub<>();
        }
        return null;
    }
}
