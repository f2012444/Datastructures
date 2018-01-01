public class Stack<E> {
    ArrayList<E> st;
    int size;
    ArrayList<E> min;
    public Stack(int length) {
        st = new ArrayList(length);
        size = 0;
        min = new ArrayList(length);
    }
    public Stack() {
        st = new ArrayList();
        min = new ArrayList();
        size = 0;
    }

    void push(E val) {
        st.add(val);
        size++;


    }

    E pop() {
        Object out = st.get(size-1);
        size--;
        return (E) out;
    }

    E peek() {
        Object out = st.get(size);
        return (E) out;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }




}
