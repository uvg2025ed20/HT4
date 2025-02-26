package uvg.edu;

        /**
         * Factory class for creating instances of different List types.
         */
        public class ListFactoryImp {

            /**
             * Gets an instance of IList based on the specified type.
             *
             * @param type the type of List to create ("simple" or "double")
             * @param <T> the type of elements in the list
             * @return an instance of IList, or null if the type is invalid
             */
            public static <T> IList<T> getList(String type) {
                if ("simple".equals(type)) {
                    return new LinkListSimp<>();
                } else if ("double".equals(type)) {
                    return new LinkListDoub<>();
                }
                return null;
            }
        }