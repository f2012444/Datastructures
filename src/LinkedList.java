public class LinkedList implements List {

    int size;
    Node root;

    public LinkedList() {
        this.root = null;
    }
    public LinkedList(Node root) {
        this.root = root;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object o) {
        if(root == null) {
            root = (Node)o;
            root.next = null;

        }
        Node temp = root;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = (Node)o;
        size++;

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
        Node temp = root;
        while(temp!=null) {
            if(temp.equals(O)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Object get(int index) {

        return null;
    }

    @Override
    public void remove(Object O) {
        if(root.equals(null)) {
            return;
        }
        if(root.equals(O)) {
            root = root.next;
        }
        Node temp = root;
        Node prev = root;
        while(temp!=null) {
            if(temp.equals(O)) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }

    }

    @Override
    public int indexOf(Object O) {
        return 0;
    }

    @Override
    public void remove(int index) {

    }
}
