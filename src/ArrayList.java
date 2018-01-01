//import java.util.ArrayList;
public class ArrayList<E> implements List<E> {
    private int size = 0;
    int capacity;
    Object[] elementData;
    public final int DEFAULT_CAPACITY = 10;
    public ArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        elementData = new Object[capacity];
    }

    public ArrayList(int size) {
        this.capacity = size;
        elementData = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    /**
     * Sets element at the current index
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if(index >=size || index < 0) {
            System.out.println("Can't do it bro");
        }
        elementData[index] = e;
    }
    public void setCapacity(int size) {
        this.capacity = size;
    }


    @Override
    public int size() {
        return size;

    }

    @Override
    public void add(E e) {
        if(size == capacity) {
            resize(size);
        }
        elementData[size++] = e;

    }

    public void resize(int size) {
        capacity = 2*size;
        Object[] temp = new Object[capacity];
        for(int i = 0;i<size;i++) {
            temp[i] = elementData[i];
        }
        elementData = temp;

    }

    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object O) {
        for(int i = 0;i<size;i++) {
            if(elementData[i].equals(O)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object e) {
        for(int i = 0;i<size;i++) {
            if(elementData[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index >=size) {
            return null;
        } else {
            return elementData[index];
        }
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >=size) {
            return;
        }
        for(int i = index;i<size-1;i++) {
            elementData[i] = elementData[i+1];
        }
        size--;
        return;

    }



    @Override
    public void remove(Object O) {
        int index = -1;
        for(int i = 0;i<size;i++) {
            if(elementData[i].equals(O)) {
                index = indexOf(O);
                break;
            }
        }
        if(index == -1) {
            return;
        } else {
            remove(index);
        }
    }
}
