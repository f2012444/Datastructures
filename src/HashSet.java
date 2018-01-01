public class HashSet<E> {
    ArrayList<ArrayList<E>> hashSet;
    int size;
    final int DEFAULT_CAPACITY = 94343443;
    public HashSet() {
        size = 0;
        hashSet.setCapacity(DEFAULT_CAPACITY);
    }
    public HashSet(int capacity) {
        size = 0;
        hashSet.setCapacity(capacity);
    }

    public void add(E e) {
        int hashCode = e.hashCode();
        hashCode = hashCode%DEFAULT_CAPACITY;
        ArrayList<E> currentList = (ArrayList<E>) hashSet.get(hashCode);
        currentList.add(e);
        size++;
        hashSet.set(hashCode, currentList);
    }

    public void remove(E e) {
        if(!hashSet.contains(e)) {
            return;
        }

        int hashCode = e.hashCode();
        hashCode = hashCode%DEFAULT_CAPACITY;
        ArrayList<E> currentList = (ArrayList<E>) hashSet.get(hashCode);
        currentList.remove(e);
        size--;
        hashSet.set(hashCode, currentList);
    }

    public boolean contains(E e) {
        int hashCode = e.hashCode();
        hashCode = hashCode%DEFAULT_CAPACITY;
        ArrayList<E> currentList = (ArrayList<E>) hashSet.get(hashCode);
        return currentList.contains(e);
    }

    public boolean isEmpty() {
        return hashSet.isEmpty();
    }






}
