import java.util.Collection;
public interface List<E> {
    /**
     * Returns the size of the list
     * @return int
     */
    int size();

    /**
     * Takes in an object and adds it at the end of the list
     * @param e
     */
    void add(E e);

    /**
     * Checks is List is Empty of it has few elements
     * @return
     */
    boolean isEmpty();

    /**
     * Checks if the list has the object e
     * @param O
     * @return
     */
    boolean contains(Object O);

    /**
     *returns the element at index index
     * @param index
     * @return
     */
    Object get(int index);

    /**
     *
     * @param O
     * @return
     */
    boolean equals(Object O);

    /**
     *
     * @param O
     */
    void remove(Object O);

    int indexOf(Object O);

    void remove(int index);

    /**
     *returns the hashcode
     * @return
     */
    int hashCode();

}
